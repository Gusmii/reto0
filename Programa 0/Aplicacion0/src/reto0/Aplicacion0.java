package reto0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Aplicacion0 extends JFrame {
	
	Boolean color=false;
	
	private JPanel contentPane;
	private JPanel panelPiso0;
    private JPanel panelPiso1;
    JPanel panelNavegacion;
    private boolean piso0 = true;
    private boolean piso1 = false;
    private boolean piso2 = false;
    private JPanel panel;
    private JButton btnSubir;
    private JPanel panelPiso2;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JButton luz,luz2,luz3,luz4,luz5,luz6,luz7,luz8,luz9,luz10;
    private JButton radiador1,radiador2,radiador3,radiador4,radiador5,radiador6,radiador7,radiador8;
    private JButton botonLuces;
   
    private JButton alarma;
    private JButton alarmaFue;
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
		
		
		panelPiso0 = new JPanel();
		panelPiso0.setForeground(Color.WHITE);
		panelPiso0.setBounds(5, 5, 588, 283);
		contentPane.add(panelPiso0);
		panelPiso0.setLayout(null);
		
		JButton luz = new JButton("");
		luz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz.setBackground(Color.RED);};
			}
		});
		luz.setBackground(Color.RED);
		luz.setBounds(80, 60, 53, 45);
		panelPiso0.add(luz);
		
		luz2 = new JButton("");
		luz2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz2.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz2.setBackground(Color.RED);}
			}
		});
		luz2.setBackground(Color.RED);
		luz2.setBounds(438, 60, 53, 45);
		panelPiso0.add(luz2);
		
		luz3 = new JButton("");
		luz3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz3.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz3.setBackground(Color.RED);};
			}
		});
		luz3.setBackground(Color.RED);
		luz3.setBounds(438, 160, 53, 45);
		panelPiso0.add(luz3);
		
		luz4 = new JButton("");
		luz4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz4.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz4.setBackground(Color.RED);};
			}
		});
		luz4.setBackground(Color.RED);
		luz4.setBounds(80, 160, 53, 45);
		panelPiso0.add(luz4);
		
		radiador1 = new JButton("");
		radiador1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador1.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador1.setBackground(Color.RED);};
			}
		});
		radiador1.setBackground(Color.RED);
		radiador1.setBounds(250, 70, 85, 21);
		panelPiso0.add(radiador1);
		
		radiador2 = new JButton("");
		radiador2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador2.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador2.setBackground(Color.RED);};
			}
		});
		radiador2.setBackground(Color.RED);
		radiador2.setBounds(250, 173, 85, 21);
		panelPiso0.add(radiador2);
		
		lblNewLabel_4 = new JLabel("Piso 0");
		lblNewLabel_4.setBounds(278, 22, 95, 28);
		panelPiso0.add(lblNewLabel_4);
		
		JLabel lblPlanta0 = new JLabel("");
		lblPlanta0.setBackground(Color.WHITE);
		lblPlanta0.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/PISO 0 (6).png")));
		lblPlanta0.setBounds(-51, 0, 658, 291);
		panelPiso0.add(lblPlanta0);
		
		
		
		panelPiso1 = new JPanel();
		panelPiso1.setBounds(5, 5, 588, 283);
		contentPane.add(panelPiso1);
		panelPiso1.setLayout(null);
		
		JButton luz5 = new JButton("");
		luz5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz5.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz5.setBackground(Color.RED);};
			}
		});
		luz5.setBackground(Color.RED);
		luz5.setBounds(80, 60, 53, 45);
		panelPiso1.add(luz5);
		
		luz6 = new JButton("");
		luz6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz6.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz6.setBackground(Color.RED);};
			}
		});
		luz6.setBackground(Color.RED);
		luz6.setBounds(438, 60, 53, 45);
		panelPiso1.add(luz6);
		
		radiador3 = new JButton("");
		radiador3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador3.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador3.setBackground(Color.RED);};
			}
		});
		radiador3.setBackground(Color.RED);
		radiador3.setBounds(68, 185, 85, 21);
		panelPiso1.add(radiador3);
		
		radiador4 = new JButton("");
		radiador4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador4.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador4.setBackground(Color.RED);};
			}
		});
		radiador4.setBackground(Color.RED);
		radiador4.setBounds(422, 185, 85, 21);
		panelPiso1.add(radiador4);
		
		JLabel lblNewLabel_1 = new JLabel("Piso 1");
		lblNewLabel_1.setBounds(270, 10, 122, 33);
		panelPiso1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/PISO 0 (6).png")));
		lblNewLabel.setBounds(-51, 0, 658, 291);
		panelPiso1.add(lblNewLabel);
		
		
		
		panelPiso2 = new JPanel();
		panelPiso2.setLayout(null);
		panelPiso2.setBounds(0, 0, 588, 288);
		contentPane.add(panelPiso2);
		
		alarmaFue = new JButton("");
		alarmaFue.setBackground(Color.GRAY);
		alarmaFue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		alarmaFue.setBounds(239, 105, 107, 91);
		panelPiso2.add(alarmaFue);
		
		JButton luz7 = new JButton("");
		luz7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz7.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz7.setBackground(Color.RED);};
			}
		});
		luz7.setBackground(Color.RED);
		luz7.setBounds(87, 46, 53, 45);
		panelPiso2.add(luz7);
		
		JButton luz8 = new JButton("");
		luz8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					luz8.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz8.setBackground(Color.RED);};
			}
		});
		luz8.setBackground(Color.RED);
		luz8.setBounds(429, 46, 53, 45);
		panelPiso2.add(luz8);
		
		JButton luz9 = new JButton("");
		luz9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					luz9.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz9.setBackground(Color.RED);};
			}
		});
		luz9.setBackground(Color.RED);
		luz9.setBounds(87, 206, 53, 45);
		panelPiso2.add(luz9);
		
		JButton luz10 = new JButton("");
		luz10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					luz10.setBackground(Color.GREEN);
				}
				else if(color==true){
					color=false;
					luz10.setBackground(Color.RED);};
			}
		});
		luz10.setBackground(Color.RED);
		luz10.setBounds(429, 206, 53, 45);
		panelPiso2.add(luz10);
		
		radiador5 = new JButton("");
		radiador5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador5.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador5.setBackground(Color.RED);};
			}
		});
		radiador5.setBackground(Color.RED);
		radiador5.setBounds(155, 59, 85, 21);
		panelPiso2.add(radiador5);
		
		radiador6 = new JButton("");
		radiador6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador6.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador6.setBackground(Color.RED);};
			}
		});
		radiador6.setBackground(Color.RED);
		radiador6.setBounds(332, 59, 85, 21);
		panelPiso2.add(radiador6);
		
		radiador7 = new JButton("");
		radiador7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador7.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador7.setBackground(Color.RED);};
			}
		});
		radiador7.setBackground(Color.RED);
		radiador7.setBounds(334, 219, 85, 21);
		panelPiso2.add(radiador7);
		
		radiador8 = new JButton("");
		radiador8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
					radiador8.setBackground(Color.BLUE);
				}
				else if(color==true){
					color=false;
					radiador8.setBackground(Color.RED);};
			}
		});
		radiador8.setBackground(Color.RED);
		radiador8.setBounds(155, 219, 85, 21);
		panelPiso2.add(radiador8);
		
		lblNewLabel_2 = new JLabel("Piso 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(242, 10, 122, 33);
		panelPiso2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Aplicacion0.class.getResource("/img/Piso 3 (2).png")));
		lblNewLabel_3.setBounds(10, 10, 658, 291);
		panelPiso2.add(lblNewLabel_3);
		
		
		
		panelNavegacion = new JPanel();
		panelNavegacion.setBounds(82, 298, 431, 80);
		panelNavegacion.setLayout(null);
		
		alarma = new JButton("Aspersor");
		alarma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(alarmaFue.getBackground()== Color.GRAY) {
					
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
							
						}else {
							//i++;
						}
					
					
				}
	
				}else {
					alarmaFue.setBackground(Color.GRAY);
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
				/*luz.setVisible(false);
				luz2.setVisible(false);
				luz3.setVisible(false);
				luz4.setVisible(false);
				radiador1.setVisible(false);
				radiador2.setVisible(false);*/
				panelPiso1.setVisible(true);
				/*luz5.setVisible(true);
				luz6.setVisible(true);
				radiador3.setVisible(true);
				radiador4.setVisible(true);*/
				piso0=false;
				piso1=true;
			}
				
				else if(piso1 == true) {
					panelPiso1.setVisible(false);
					/*luz5.setVisible(false);
					luz6.setVisible(false);
					radiador3.setVisible(false);
					radiador4.setVisible(false);*/
					panelPiso2.setVisible(true);
					/*luz7.setVisible(true);
					luz8.setVisible(true);
					luz9.setVisible(true);
					luz10.setVisible(true);
					radiador5.setVisible(true);
					radiador6.setVisible(true);
					radiador7.setVisible(true);
					radiador8.setVisible(true);*/
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
						/*luz5.setVisible(false);
						luz6.setVisible(false);
						radiador3.setVisible(false);
						radiador4.setVisible(false);*/
						panelPiso0.setVisible(true);
						/*luz.setVisible(true);
						luz2.setVisible(true);
						luz3.setVisible(true);
						luz4.setVisible(true);
						radiador1.setVisible(true);
						radiador2.setVisible(true);*/
						piso1=false;
						piso0=true;
					}
					 else if(piso2 == true) {
						 	panelPiso2.setVisible(false);
						 	/*luz7.setVisible(false);
							luz8.setVisible(false);
							luz9.setVisible(false);
							luz10.setVisible(false);
							radiador5.setVisible(false);
							radiador6.setVisible(false);
							radiador7.setVisible(false);
							radiador8.setVisible(false);*/
							panelPiso1.setVisible(true);
							/*luz5.setVisible(true);
							luz6.setVisible(true);
							radiador3.setVisible(true);
							radiador4.setVisible(true);*/
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
		
		botonLuces = new JButton("ON");
		botonLuces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(color==false) {
					color=true;
				luz.setBackground(Color.GREEN);
				luz2.setBackground(Color.GREEN);
				luz3.setBackground(Color.GREEN);
				luz4.setBackground(Color.GREEN);
				luz5.setBackground(Color.GREEN);
				luz6.setBackground(Color.GREEN);
				luz7.setBackground(Color.GREEN);
				luz8.setBackground(Color.GREEN);
				luz9.setBackground(Color.GREEN);
				luz10.setBackground(Color.GREEN);
				botonLuces.setText("OFF");
				}
				else if(color==true){
					color=false;
					luz.setBackground(Color.RED);
					luz2.setBackground(Color.RED);
					luz3.setBackground(Color.RED);
					luz4.setBackground(Color.RED);
					luz5.setBackground(Color.RED);
					luz6.setBackground(Color.RED);
					luz7.setBackground(Color.RED);
					luz8.setBackground(Color.RED);
					luz9.setBackground(Color.RED);
					luz10.setBackground(Color.RED);
					botonLuces.setText("ON");
					}
			}
		});
		botonLuces.setBounds(319, 10, 85, 65);
		
		panelNavegacion.add(botonLuces);
	
		
	}
	
	public static void main1(String[] ar) {
		Aplicacion0 ventana=new Aplicacion0();
		ventana.setBounds(500,250,300,250);
		ventana.setVisible(true);
		ventana.setResizable(false);
		}
}