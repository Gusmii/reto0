package reto0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class Aplicacion0 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2952251870704117145L;


	Boolean color=false;
	
	
	private JPanel contentPane,panelPiso0,panelPiso1;
    JPanel panelNavegacion;
    private boolean piso0 = true;
    private boolean piso1 = false;
    private boolean piso2 = false;
    private JPanel panel;
    private JButton btnSubir;
    private JPanel panelPiso2;
    private JLabel lblNewLabel_2,lblNewLabel_3,lblNewLabel_4;
    private JToggleButton calefaccion,calefaccion2,calefaccion3,calefaccion4,calefaccion5,calefaccion6,calefaccion7,calefaccion8,calefaccion9,calefaccion10,calefaccion11,calefaccion12,calefaccion13,calefaccion14,calefaccion15,calefaccion16;
    private JButton botonCalefaccion;
   
    private JButton alarma;
    private JButton alarmaFue,alarmaFue2,alarmaFue3;
    
    private ArrayList<JToggleButton> AR_btn = new ArrayList<JToggleButton>();
    private ArrayList<alarma> AR_alarma = new ArrayList<alarma>();
    private ArrayList<calefaccion> AR_calefaccion = new ArrayList<calefaccion>();
    public static void sleep(long milis)throws InterruptedException{}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion0 frame = new Aplicacion0();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void compararEstado() {
		
		String aula;
		Boolean estado;
		
		for (int i = 0; i < AR_calefaccion.size(); i++) {
			
			//System.out.println(AR_calefaccion.get(i).getAula().toString());
			aula= AR_calefaccion.get(i).getAula();
			estado = AR_calefaccion.get(i).getEstado();
			
			for (int x = 0; x < AR_btn.size(); x++) {
				
				if(aula.equals(AR_btn.get(x).getText())) {
					
					if(estado == true) {
					
						AR_btn.get(x).setSelected(true);
						
					}
					
					break;
					
				}
				
			}
			
		}
		
	}
	
public void cargarCalefaccion() {
		
		Connection konexioa;
		try {
			konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");

			Statement st = konexioa.createStatement();
			ResultSet rse = st.executeQuery("SELECT * FROM calefaccion");
			
			while (rse.next()) {
				int piso = Integer.parseInt(rse.getObject("piso").toString());
				Boolean estado = Boolean.parseBoolean(rse.getObject("estado").toString());
				String aula = rse.getObject("aula").toString();
				calefaccion calefaccion1 = new calefaccion(rse.getObject("fecha").toString(), piso , aula, estado);
				AR_calefaccion.add(calefaccion1); 		
			}
			compararEstado();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

/* 
 * Metodo que comprueba en que estado se encuentra la calefaccion y guarda el registro
 * */
public void insertcalefaccion(String VarAula, JToggleButton btn) {

	Connection konexioa;
	Statement st = null;
	
	/*
	
	int piso=0;
	
	if(piso1==true) {
		
		piso=1;
		
	} else if (piso2==true) {
		
		piso=2;
		
	}
	*/
	
	if(!btn.isSelected()) {
		
		try {
			konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");

			 st = konexioa.createStatement();
			
				
				Date date = new Date();
				DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				//st.executeUpdate("INSERT INTO calefaccion  VALUES ('" + hourdateFormat.format(date) + "','"
				//		+ piso + "','"+ VarAula +"' ,'" + 0 + "')");
				
				
				st.executeUpdate("UPDATE `calefaccion` SET `fecha`='"+ hourdateFormat.format(date) +"',`estado`= 1 WHERE aula = '"+ VarAula +"'");
				
				st.close();
				konexioa.close();
				
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}else {
		
		//Si esta apagado
		
		
		
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
			st = konexioa.createStatement();
			
			
			//st.executeUpdate("INSERT INTO calefaccion  VALUES ('" + hourdateFormat.format(date) + "','"
			//		+ piso + "','"+ VarAula +"' ,'" + 1 + "')");
			
			//System.out.println("UPDATE `calefaccion` SET `fecha`="+ hourdateFormat.format(date) +",`estado`= 0 WHERE aula = "+ VarAula +"");
			
			st.executeUpdate("UPDATE `calefaccion` SET `fecha`= '"+ hourdateFormat.format(date) +"',`estado`= 0 WHERE aula = '"+ VarAula +"'");
		
			st.close();
			konexioa.close();
		} 
		
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
}


public void cargarAlarma() {
	
	Connection konexioa;
	try {
		konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
		// ondo burutu baldin bada
		System.out.println("Konexio egokia.");

		Statement st = konexioa.createStatement();
		ResultSet rse = st.executeQuery("SELECT * FROM alarma");
		
		while (rse.next()) {
			int piso = Integer.parseInt(rse.getObject("piso").toString());
			
			Boolean estado = Boolean.parseBoolean(rse.getObject("estado").toString());
			
			alarma alarma1 = new alarma(rse.getObject("fecha").toString(), piso, estado );
			AR_alarma.add(alarma1); 
			
		}
		st.close();
		rse.close();
		konexioa.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}


	
	
	/**
	 * Create the frame.
	 */
	public Aplicacion0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cargarAlarma();
		
		
		panelPiso0 = new JPanel();
		panelPiso0.setForeground(Color.WHITE);
		panelPiso0.setBounds(5, 5, 588, 283);
		contentPane.add(panelPiso0);
		panelPiso0.setLayout(null);
		
		alarmaFue = new JButton("");
		alarmaFue.setBackground(Color.GRAY);
		alarmaFue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Connection konexioa;
				try {
					konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
					// ondo burutu baldin bada
					System.out.println("Konexio egokia.");

					Statement st = konexioa.createStatement();
					
					Date date = new Date();
					DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					st.executeUpdate("INSERT INTO alarma  VALUES ('" + hourdateFormat.format(date) + "','"
							+ 1 + "')");
					
					st.close();
					konexioa.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		alarmaFue.setBounds(239, 105, 107, 91);
		panelPiso0.add(alarmaFue);
		
		JToggleButton calefaccion = new JToggleButton("a1");
		
		calefaccion.setBounds(90, 22, 27, 28);
		panelPiso0.add(calefaccion);
		calefaccion.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				insertcalefaccion(calefaccion.getText(), calefaccion);
			}
					
			
		});
		
		calefaccion2 = new JToggleButton("a2");
		calefaccion2.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion2.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion2.getText(), calefaccion2);
			}
		});
		
		calefaccion2.setBounds(484, 22, 27, 28);
		panelPiso0.add(calefaccion2);
		
		calefaccion3 = new JToggleButton("a3");
		calefaccion3.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion3.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
					insertcalefaccion(calefaccion3.getText(), calefaccion3);
			}
		});
		
		calefaccion3.setBounds(484, 85, 27, 28);
		panelPiso0.add(calefaccion3);
		
		calefaccion4 = new JToggleButton("a4");
		calefaccion4.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion4.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
					insertcalefaccion(calefaccion4.getText(), calefaccion4);
			}
		});
		
		calefaccion4.setBounds(484, 141, 27, 28);
		panelPiso0.add(calefaccion4);
		
		calefaccion5 = new JToggleButton("a5");
		calefaccion5.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion5.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion5.getText(), calefaccion5);
			}
		});
		
		calefaccion5.setBounds(80, 160, 53, 45);
		panelPiso0.add(calefaccion5);
		
		calefaccion6 = new JToggleButton("a6");
		calefaccion6.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion6.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion6.getText(), calefaccion6);
			}
		});
		
		calefaccion6.setBounds(90, 97, 27, 28);
		panelPiso0.add(calefaccion6);
		
		lblNewLabel_4 = new JLabel("Piso 0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_4.setBounds(249, 214, 122, 33);
		panelPiso0.add(lblNewLabel_4);
		
		JLabel lblPlanta0 = new JLabel("");
		lblPlanta0.setBackground(Color.WHITE);
		lblPlanta0.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/PISO 0 (6).png")));
		lblPlanta0.setBounds(-51, 0, 658, 291);
		panelPiso0.add(lblPlanta0);
		
		
		
		panelPiso1 = new JPanel();
		panelPiso1.setVisible(false);
		panelPiso1.setBounds(5, 5, 588, 283);
		contentPane.add(panelPiso1);
		panelPiso1.setLayout(null);
		
		alarmaFue2 = new JButton("");
		alarmaFue2.setBackground(Color.GRAY);
		alarmaFue2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Connection konexioa;
				try {
					konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
					// ondo burutu baldin bada
					System.out.println("Konexio egokia.");

					Statement st = konexioa.createStatement();
					
					Date date = new Date();
					DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					st.executeUpdate("INSERT INTO alarma  VALUES ('" + hourdateFormat.format(date) + "','"
							+ 2 + "')");
					
					
					st.close();
					konexioa.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		alarmaFue2.setBounds(239, 105, 107, 91);
		panelPiso1.add(alarmaFue2);
		
		JToggleButton calefaccion7 = new JToggleButton("a7");
		calefaccion7.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion7.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
					insertcalefaccion(calefaccion7.getText(), calefaccion7);
			}
		});
		
		
		calefaccion7.setBounds(90, 22, 27, 28);
		panelPiso1.add(calefaccion7);
		
		calefaccion8 = new JToggleButton("a8");
		calefaccion8.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion8.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion8.getText(), calefaccion8);
			}
		});
		
		
		calefaccion8.setBounds(484, 22, 27, 28);
		panelPiso1.add(calefaccion8);
		
		calefaccion9 = new JToggleButton("a9");
		calefaccion9.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion9.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion9.getText(), calefaccion9);
			}
		});
		
		
		calefaccion9.setBounds(484, 85, 27, 28);
		panelPiso1.add(calefaccion9);
		
		calefaccion10 = new JToggleButton("a10");
		calefaccion10.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion10.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion10.getText(), calefaccion10);
			}
		});
		
		
		
		calefaccion10.setBounds(484, 141, 27, 28);
		panelPiso1.add(calefaccion10);
		
		calefaccion11 = new JToggleButton("a11");
		calefaccion11.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion11.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion11.getText(), calefaccion11);
			}
		});
		
		
		
		calefaccion11.setBounds(80, 160, 53, 45);
		panelPiso1.add(calefaccion11);
		
		calefaccion12 = new JToggleButton("a12");
		calefaccion12.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion12.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion12.getText(), calefaccion12);
			}
		});
		
		
		
		calefaccion12.setBounds(90, 97, 27, 28);
		panelPiso1.add(calefaccion12);
		
		JLabel lblNewLabel_1 = new JLabel("Piso 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(249, 214, 122, 33);
		panelPiso1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/PISO 0 (6).png")));
		lblNewLabel.setBounds(-51, 0, 658, 291);
		panelPiso1.add(lblNewLabel);
		
		
		
		panelPiso2 = new JPanel();
		panelPiso2.setVisible(false);
		panelPiso2.setLayout(null);
		panelPiso2.setBounds(0, 0, 588, 288);
		contentPane.add(panelPiso2);
		
		alarmaFue3 = new JButton("");
		alarmaFue3.setBackground(Color.GRAY);
		alarmaFue3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Connection konexioa;
				try {
					konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
					// ondo burutu baldin bada
					System.out.println("Konexio egokia.");

					Statement st = konexioa.createStatement();
					
					Date date = new Date();
					DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					st.executeUpdate("INSERT INTO alarma  VALUES ('" + hourdateFormat.format(date) + "','"
							+ 3 + "')");
					st.close();
					konexioa.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		alarmaFue3.setBounds(239, 105, 107, 91);
		panelPiso2.add(alarmaFue3);
		
		JToggleButton calefaccion13 = new JToggleButton("a13");
		calefaccion13.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion13.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion13.getText(), calefaccion13);
			}
		});
		
		
		
		calefaccion13.setBounds(114, 84, 33, 27);
		panelPiso2.add(calefaccion13);
		
		JToggleButton calefaccion14 = new JToggleButton("a14");
		calefaccion14.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion14.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion14.getText(), calefaccion14);
			}
		});
		
		
		
		calefaccion14.setBounds(429, 84, 33, 27);
		panelPiso2.add(calefaccion14);
		
		JToggleButton calefaccion15 = new JToggleButton("a15");
		calefaccion15.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion15.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion15.getText(), calefaccion15);
			}
		});
		
		
		
		calefaccion15.setBounds(114, 186, 33, 27);
		panelPiso2.add(calefaccion15);
		
		JToggleButton calefaccion16 = new JToggleButton("a16");
		calefaccion16.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Crojo.png")));
		calefaccion16.setSelectedIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Cverde.png")));
		calefaccion16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					insertcalefaccion(calefaccion16.getText(), calefaccion16);
			}
		});
		
		
		
		calefaccion16.setBounds(429, 186, 33, 27);
		panelPiso2.add(calefaccion16);
		
		lblNewLabel_2 = new JLabel("Piso 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(249, 214, 122, 33);
		panelPiso2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Piso 3 (2).png")));
		lblNewLabel_3.setBounds(10, 10, 658, 291);
		panelPiso2.add(lblNewLabel_3);
		
		
		
		panelNavegacion = new JPanel();
		panelNavegacion.setBounds(39, 298, 554, 80);
		panelNavegacion.setLayout(null);
		
		alarma = new JButton("Aspersor");
		alarma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(alarmaFue.getBackground()== Color.GRAY||alarmaFue2.getBackground()== Color.GRAY||alarmaFue3.getBackground()== Color.GRAY) {
					
					for (int i = (int)(Math.random()* (100-1)) + 1; i < 100; ++i) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.out.println(i);
						if(i == 99) {
							
							alarmaFue.setBackground(Color.red);
							alarmaFue2.setBackground(Color.red);
							alarmaFue3.setBackground(Color.red);
							
						}else {
							//i++;
						}
					
					
				}
	
				}else {
					alarmaFue.setBackground(Color.GRAY);
					alarmaFue2.setBackground(Color.GRAY);
					alarmaFue3.setBackground(Color.GRAY);
				}
				
			}
		});
		alarma.setBounds(27, 10, 85, 65);
		panelNavegacion.add(alarma);
		
		
		btnSubir = new JButton("");
		btnSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(piso0 == true){
				panelPiso0.setVisible(false);
				panelPiso1.setVisible(true);
				piso0=false;
				piso1=true;
			}
				
				else if(piso1 == true) {
					panelPiso1.setVisible(false);
					panelPiso2.setVisible(true);
					piso1=false;
					piso2=true;
				}
		}
		});
		btnSubir.setContentAreaFilled(false);
		btnSubir.setFocusPainted(false);
		btnSubir.setBorderPainted(false);
		btnSubir.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Arriba.png")));
		btnSubir.setBounds(117, 5, 96, 72);
		panelNavegacion.add(btnSubir);
		
		JButton btnBajar = new JButton("");
		
		btnBajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					 if(piso1 == true) {
						panelPiso1.setVisible(false);
						panelPiso0.setVisible(true);
						piso1=false;
						piso0=true;
					}
					 else if(piso2 == true) {
						 	panelPiso2.setVisible(false);
							panelPiso1.setVisible(true);
							piso1=true;
							piso2=false;
					 }
			}
		});
		btnBajar.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/6619449971543238856-64 (1).png")));
		btnBajar.setFocusPainted(false);
		btnBajar.setContentAreaFilled(false);
		btnBajar.setBorderPainted(false);
		btnBajar.setBounds(218, 5, 96, 72);
		panelNavegacion.add(btnBajar);
		contentPane.add(panelNavegacion);
		
		
			
		AR_btn.add(calefaccion);
		AR_btn.add(calefaccion2);
		AR_btn.add(calefaccion3);
		AR_btn.add(calefaccion4);
		AR_btn.add(calefaccion5);
		AR_btn.add(calefaccion6);
		AR_btn.add(calefaccion7);
		AR_btn.add(calefaccion8);
		AR_btn.add(calefaccion9);
		AR_btn.add(calefaccion10);
		AR_btn.add(calefaccion11);
		AR_btn.add(calefaccion12);
		AR_btn.add(calefaccion13);
		AR_btn.add(calefaccion14);
		AR_btn.add(calefaccion15);
		AR_btn.add(calefaccion16);
			
		
		
		
		
		botonCalefaccion = new JButton("ON");
		botonCalefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(botonCalefaccion.getText().equals("ON")) {
					
				calefaccion.setSelected(true);
				calefaccion2.setSelected(true);
				calefaccion3.setSelected(true);
				calefaccion4.setSelected(true);
				calefaccion5.setSelected(true);
				calefaccion6.setSelected(true);
				calefaccion7.setSelected(true);
				calefaccion8.setSelected(true);
				calefaccion9.setSelected(true);
				calefaccion10.setSelected(true);
				calefaccion11.setSelected(true);
				calefaccion12.setSelected(true);
				calefaccion13.setSelected(true);
				calefaccion14.setSelected(true);
				calefaccion15.setSelected(true);
				calefaccion16.setSelected(true);
				botonCalefaccion.setText("OFF");
				
				Connection konexioa;
				Statement st = null;
				
				Date date = new Date();
				DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				try {
					konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
					st = konexioa.createStatement();
					
					System.out.println("UPDATE `calefaccion` SET `fecha`="+ hourdateFormat.format(date) +",`estado`= 1 ");
					
					st.executeUpdate("UPDATE `calefaccion` SET `fecha`= '"+ hourdateFormat.format(date) +"',`estado`= 1 ");
				
				
					st.close();
					konexioa.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
				else if(botonCalefaccion.getText().equals("OFF")){
					
					calefaccion.setSelected(false);
					calefaccion2.setSelected(false);
					calefaccion3.setSelected(false);
					calefaccion4.setSelected(false);
					calefaccion5.setSelected(false);
					calefaccion6.setSelected(false);
					calefaccion7.setSelected(false);
					calefaccion8.setSelected(false);
					calefaccion9.setSelected(false);
					calefaccion10.setSelected(false);
					calefaccion11.setSelected(false);
					calefaccion12.setSelected(false);
					calefaccion13.setSelected(false);
					calefaccion14.setSelected(false);
					calefaccion15.setSelected(false);
					calefaccion16.setSelected(false);
					botonCalefaccion.setText("ON");
					
					
					Connection konexioa;
					Statement st = null;
					
					Date date = new Date();
					DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					try {
						konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto0", "root", "");
						st = konexioa.createStatement();
						
						System.out.println("UPDATE `calefaccion` SET `fecha`="+ hourdateFormat.format(date) +",`estado`= 0 ");
						
						st.executeUpdate("UPDATE `calefaccion` SET `fecha`= '"+ hourdateFormat.format(date) +"',`estado`= 0 ");
					
						st.close();
						konexioa.close();
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					}
			}
		});
		botonCalefaccion.setBounds(425, 10, 85, 65);
		
		panelNavegacion.add(botonCalefaccion);
		
		cargarCalefaccion();
		
	}
	
	public static void main1(String[] ar) {
		Aplicacion0 ventana=new Aplicacion0();
		ventana.setBounds(500,250,300,250);
		ventana.setVisible(true);
		ventana.setResizable(false);
		}
}