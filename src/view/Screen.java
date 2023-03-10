
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Screen extends JPanel {

	public Screen() {
		initComponents();
	}

	public void initComponents() {
		this.setLayout(new BorderLayout());
		icon = new ImageIcon("introduce1.jpg");
		JPanel screen = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);

			}
		};
		acountNumberField = new JTextField();
		amountMoneyField = new JTextField();
		inforLable = new JLabel();
		inforLable.setFont(new Font("Serif", 1, 17));
		acountNumberField.setFont(new Font("Serif", 1, 17));
		// acountNumberField.setForeground(Color.BLUE);
		amountMoneyField.setFont(new Font("Serif", 1, 18));
		inforLable.setForeground(Color.BLUE);

		picture = new JLabel();
		pin = new JPasswordField(6);
		infor1 = new JTextPane();
		
	
		infor1.setOpaque(false);
		infor2 = new JTextPane();
		infor2.setOpaque(false);
		
		for (int i = 0; i < leftButtons.length; i++) {
			leftButtons[i] = new JButton();
		}

		for (int i = 0; i < rightButtons.length; i++) {
			rightButtons[i] = new JButton();
		}

		for (int i = 0; i < menu.length; i++) {
			menu[i] = new JLabel();
			menu[i].setOpaque(true);
			menu[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			menu[i].setBackground(Color.BLUE);
			menu[i].setFont(new java.awt.Font("sansserif", 1, 17));
			menu[i].setForeground(Color.WHITE);

		}
		screen.add(picture);
		screen.add(pin);
		screen.add(acountNumberField);
		screen.add(amountMoneyField);
		screen.add(inforLable);
		inforLable.setOpaque(true);
		pin.setBackground(new java.awt.Color(72, 209, 204));
		amountMoneyField.setBackground(new java.awt.Color(72, 209, 204));
		acountNumberField.setBackground(new java.awt.Color(72, 209, 204));
		pin.setHorizontalAlignment(JLabel.CENTER);
		pin.setFont(new Font("sanserif", 1, 17));
		pin.setEchoChar('*');

		// screen.setBackground(new java.awt.Color(0, 153, 153));
		screen.setBackground(Color.WHITE);
		screen.setLayout(null);
		for (int i = 0; i < menu.length; i++) {
			screen.add(menu[i]);
		}

		menu[0].setBounds(11, 44, 180, 44);
		menu[0].setText(" R??t ti???n");
		menu[1].setBounds(11, 107, 180, 44);
		menu[1].setText(" Chuy???n kho???n");
		menu[2].setBounds(11, 170, 180, 44);
		menu[2].setText(" Thanh to??n");
		menu[3].setBounds(11, 229, 180, 44);
		menu[3].setText(" ????ng k?? d???ch v???");
		menu[4].setBounds(259, 44, 180, 44);
		menu[4].setText(" ?????i PIN");
		menu[5].setBounds(259, 104, 180, 44);
		menu[5].setText(" V???n tin s??? d??");
		menu[6].setBounds(259, 170, 180, 44);
		menu[6].setText(" In sao k?? r??t g???n");
		menu[7].setBounds(259, 229, 180, 44);
		menu[7].setText(" DV Kh??c");
		screen.add(infor1);

		screen.add(infor2);

		infor1.setContentType("text/html");
		infor2.setContentType("text/html");
//		infor1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		infor2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		screen.setBorder(javax.swing.BorderFactory.createMatteBorder(18, 6, -12, 6, new java.awt.Color(0, 0, 0)));
		screen.setPreferredSize(new Dimension(450, 100));
		this.add(screen, BorderLayout.CENTER);

		JPanel leftButtonsPanel = new JPanel();
		javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(leftButtonsPanel);
		leftButtonsPanel.setLayout(leftLayout);
		leftLayout.setHorizontalGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(leftLayout.createSequentialGroup().addGap(14, 14, 14).addGroup(leftLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(leftButtons[0], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(leftButtons[1], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(leftButtons[2], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(leftLayout.createSequentialGroup().addComponent(leftButtons[3],
								javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(0, Short.MAX_VALUE)));
		leftLayout
				.setVerticalGroup(
						leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(leftLayout.createSequentialGroup().addContainerGap().addGap(40, 40, 40)
										.addComponent(leftButtons[0], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(leftButtons[1], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(leftButtons[2], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(leftButtons[3], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));
		this.add(leftButtonsPanel, BorderLayout.WEST);

		JPanel rightButtonsPanel = new JPanel();
		javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(rightButtonsPanel);
		rightButtonsPanel.setLayout(rightLayout);
		rightLayout.setHorizontalGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(rightLayout.createSequentialGroup().addGap(12, 12, 12).addGroup(rightLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(rightButtons[0], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rightButtons[1], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rightButtons[2], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(rightLayout.createSequentialGroup().addComponent(rightButtons[3],
								javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(0, Short.MAX_VALUE)));
		rightLayout
				.setVerticalGroup(
						rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(rightLayout.createSequentialGroup().addContainerGap().addGap(43, 43, 43)
										.addComponent(rightButtons[0], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(rightButtons[1], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(rightButtons[2], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(rightButtons[3], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));
		this.add(rightButtonsPanel, BorderLayout.EAST);
		clearScreen();

	}

	public void cardInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Th??? kh??ng h???p l???"
				+ "<br>Card invalid</font></center></b>");
	}
	
	public void moneyInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>S??? ti???n mu???n r??t kh??ng h???p l???"
				+ "<br>Card invalid</font></center></b>");
	}
	
	public void amountMoneyInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>S??? ti???n kh??ng h???p l???"
				+ "<br>Card invalid</font></center></b>");
	}

	public void lenghtOfAcountWrong() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>S??? t??i kho???n ph???i ????? 15 s???"
				+ "<br>Card invalid</font></center></b>");
	}

	public void waitDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>??ang th???c hi???n giao d???ch..."
				+ "<br>Xin vui l??ng ch???</font></center></b>");
	}

	public void lockDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>T??i kho???n c???a Qu?? kh??ch ???? b??? kh??a"
				+ "<br>Xin vui l??ng li??n h??? ng??n h??ng ho???c s??? 19007329</font></center></b>");
	}

	public void wrongPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>M?? Pin sai, Vui l??ng nh???p l???i"
				+ "<br><font color=red>(Nh???p sai 3 l???n t??i kho???n c???a qu?? kh??c s??? b??? kh??a)</font></font></center></b>");
	}

	public void wrongLenghtPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>M?? Pin ph???i ????? 6 s???, Vui l??ng nh???p l???i</font></font></center></b>");
	}

	public void waitForTakeBillDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???n h??a ????n</font></font></center></b>");
	}

	public void ejectCarddisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=4 color=blue>XIN QU?? KH??CH NH???N L???I TH???."
				+ "<br>????? ?????M B???O AN TO??N, TH??? C???A QU?? KH??CH "
				+ "<br>S??? ???????C RUNG L??N KHI GIAO D???CH.</font></center></b>");
	}

	public void thankdisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><b><center><font size=5 color=blue>NLU ch??n th??nh c???m ??n Qu?? kh??ch"
				+ "<br>???? s??? d???ng d???ch v???</font></center></b>");
	}

	public void changePinSuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>B???n ???? ?????i PIN th??nh c??ng</font></center></b>");
	}
	
	public void transferMoneySuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>Giao d???ch chuy???n ti???n th??nh c??ng</font></center></b>");
	}
	
	public void transferMoneyNotSuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Giao d???ch chuy???n ti???n kh??ng th??nh c??ng"
				+ "<br><font size=5 color=red>(Vui l??ng ki???m tra l???i s??? t??i kho???n nh???n ti???n v?? s??? d?? t??i kho???n c??n l???i ??t nh???t 50,000 VND)</font></font></center></b>");
	}

	public void wrongConformPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>Nh???p l???i m?? pin sai, vui l??ng nh???p l???i</font></center></b>");
	}

	public void languageDisplay(String name) {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" VI???T NAM");
		menu[7].setVisible(true);
		menu[7].setText(" ENGLISH");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=4 color=blue>XIN CH??O QU?? KH??CH: " + name
				+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;WELCOME: " + name + "</font></center></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText("<br><b><center><font size=3 color=blue>VUI L??NG L???A CH???N NG??N NG???:"
				+ "<br>PLEASE SELECT YOUR LANGUAGE:</font></center></b>");

	}

	public void continueDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" C??");
		menu[7].setVisible(true);
		menu[7].setText(" KH??NG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Qu?? kh??ch c?? ti???p t???c th???c hi???n giao d???ch kh??c?</font></center></b>");

	}
	
	public void takeBillOrNotDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" C??");
		menu[7].setVisible(true);
		menu[7].setText(" KH??NG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Qu?? kh??ch c?? l???y h??a ????n kh??ng?</font></center></b>");

	}
	
	public void takeCardBeforeCashDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???n TH??? tr?????c,"
				+ "<br>sau ???? nh???n TI???N."
				+ "<br><br><font size=4 color=blue>????? ?????M B???O AN TO??N,"
				+ "<br>TH??? C???A QU?? KH??CH S??? ???????C RUNG L??N"
				+ "<br>KHI GIAO D???CH</font></font></center></b>");

	}
	
	public void reciveMoneyDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???n ti???n</center></b>");

	}

	public void NoteDisplay() {
		clearScreen();
		picture.setVisible(true);
		icon = new ImageIcon("background.png");
		menu[7].setVisible(true);
		menu[7].setText(" TI???P T???C");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 135);
		infor1.setText("<b>&nbsp;&emsp;<font size=4 color=blue>TR?????C KHI TH???C HI???N GIAO D???CH, QU?? KH??CH N??N:"
				+ "<br><font>&nbsp;&emsp;- Quan s??t k??? m??y atm ????? ph??t hi???n vi???c m??y b??? g???n thi???t b??? ????nh"
				+ "<br>&nbsp;&emsp;c???p d??? li???u. ?????c bi???t ch?? ?? t???i m???t s??? ?????c ??i???m sau (h??nh d?????i):"
				+ "<br>&emsp;&nbsp;1. B??n ph??m ATM;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;2. ?????u ?????c th???;"
				+ "<br>&emsp;&nbsp;3. V??? tr?? camera ????? l???y c???p s??? PIN;&emsp;&emsp;&emsp;4. V??? m??y ATM;"
				+ "<br>&emsp;&nbsp;-Kh??ng th???c hi???n giao d???ch n???u ph??t hi???n d???u hi???u b???t th?????ng."
				+ "<br>&emsp;&nbsp;-G???i s??? 19004297 ????? ki???m tra v?? s??? l??</font></font></b>");
		picture.setBounds(45, 155, 184, 130);
		picture.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		picture.setIcon(new ImageIcon("note1.png"));

	}

	public void pinDisplay() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 60);
		infor1.setText("<br><b><center><font size=4 color=blue>QU?? KH??CH H??Y NH???P S??? PIN SAU ???? ???N ENTER"
				+ "<br>(Qu?? kh??ch l??u ?? d??ng tay che b??n ph??m, tr??nh b??? l??? m?? PIN)</font></center></b>");
		pin.setBounds(167, 88, 120, 35);
		picture.setVisible(true);
		picture.setBounds(160, 146, 130, 83);
		picture.setIcon(new ImageIcon("chetay.jpg"));
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=5 color=blue>Ch???n <font color=red>CANCEL</font> ????? tho??t</font></center></b>");
	}

	public void changePinStep1Display() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<b><center><font size=5 color=blue>????? b???o m???t th??ng tin v?? b???o ?????m an to??n giao d???ch,"
				+ "<br>Qu?? kh??ch vui l??ng thay ?????i m?? PIN theo h?????ng d???n." + "<br>Qu?? kh??ch nh???p m?? PIN m???i t???i ????y"
				+ "<br>(????? d??i c???a PIN l?? 6 s???)</font></center></b>");
		pin.setBounds(167, 120, 120, 35);

		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(Qu?? kh??ch ch???n Enter ????? ti???p t???c, Canel ????? tho??t)</font></center></b>");
	}

	public void changePinStep2Display() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 70);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???p PIN m???t l???n n???a</font></center></b>");
		pin.setBounds(167, 100, 120, 35);

		infor2.setVisible(true);
		infor2.setBounds(5, 230, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(???n Clear ????? nh???p l???i ho???c Canel ????? tho??t)</font></center></b>");
	}

	public void feeDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 230);
		infor1.setText("<b><center><font size=5 color=blue>NLU xin th??ng b??o Qu?? kh??ch"
				+ "<br>v??? m???c ph?? giao d???ch th???c hi???n tr??n ATM nh?? sau:" + "<table border=1 color=blue"
				+ "><tr><td>Ph?? r??t ti???n m???t</td><td>1.000 VND/giao d???ch</td></tr>"
				+ "<tr><td>Ph?? chuy???n kho???n trong c??ng h??? th???ng NLU</td><td>3.000 VND/giao d???ch c??ng h??? th???ng<br>5.000 VND/giao d???ch kh??c h??? th???ng</td></tr>"
				+ "<tr><td>Ph?? in h??a ????n</td><td>500 VND/giao d???ch</td></tr>"
				+ "<tr><td>Ph?? y??u c???u in sao k?? t??i kho???n</td><td>5.000 VND/l???n</td></tr></table></font></center></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 247, 440, 50);
		infor2.setText("<b><center><font size=4 color=blue>Qu?? kh??ch ch???n <font color=red>ENTER</font> ????? ti???p t???c"
				+ "<br>ch???n <font color=red>CANCEL</font> ????? tho??t</font></center></b>");
	}

	public void introducedisplay() {
		clearScreen();

		icon = new ImageIcon("introduce1.jpg");
	}

	public void menuDisplay() {
		icon = new ImageIcon("background.png");
		clearScreen();
		for (int i = 0; i < menu.length; i++) {
			menu[i].setVisible(true);
		}

		menu[0].setText(" R??t ti???n");

		menu[1].setText(" Chuy???n kho???n");

		menu[2].setText(" Thanh to??n");

		menu[3].setText(" ????ng k?? d???ch v???");

		menu[4].setText(" ?????i PIN");

		menu[5].setText(" V???n tin s??? d??");

		menu[6].setText(" In sao k?? r??t g???n");

		menu[7].setText(" DV Kh??c");

	}

	public void banlanceInquiryDisplay(int balance) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" C??");
		menu[7].setVisible(true);
		menu[7].setText(" KH??NG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText(
				"<br><b><font size=4 color=blue><font size=5 color=blue><center>GIAO DICH V???N TIN S??? D??</center></font>"
						+ "<br>&nbsp;S??? D?? T??I KHO???N HI???N T???I C???A QU?? KH??CH: " + num + " VND"
						+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;PH?? GIAO D???CH: 0.00 VND"
						+ "<br><center>&nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;VAT: 0.00 VND</center></font></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText(
				"<br><b><center><font size=4 color=blue><br>Qu?? kh??ch c?? mu???n in h??a ????n kh??ng?</font></center></b>");

	}
	
	public void conformWithdrawDisplay(int balance) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" C??");
		menu[7].setVisible(true);
		menu[7].setText(" KH??NG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText(
				"<br><b><font size=4 color=blue><font size=5 color=blue><center>Giao d???ch r??t ti???n c???a qu?? kh??ch th??nh c??ng.</center></font>"
						+ "<br>&nbsp;S??? D?? T??I KHO???N HI???N T???I C???A QU?? KH??CH: " + num + " VND"
						+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;PH?? GIAO D???CH: 1.000 VND"
						+ "<br><center>&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;VAT: 100 VND</center></font></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText(
				"<br><b><center><font size=4 color=blue><br>Qu?? kh??ch c?? mu???n in h??a ????n kh??ng?</font></center></b>");

	}

	public void tranferMoneyStep1Display() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 60);
		infor1.setText(
				"<br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???p t??i kho???n nh??n ti???n</font></center></b>");
		acountNumberField.setVisible(true);
		acountNumberField.setBounds(210, 95, 170, 35);
		inforLable.setVisible(true);
		inforLable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inforLable.setBounds(60, 95, 153, 35);
		inforLable.setText("T??i kho???n nh???n ti???n:");
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(Ch???n ENTER ????? ?????ng ??, CANCEL ????? tho??t)</font></center></b>");
	}

	public void tranferMoneyStep2Display() {
		clearScreen();

		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=5 color=blue>Qu?? kh??ch vui l??ng nh???p s??? ti???n mu???n chuy???n"
				+ "<br><br>T??i kho???n nh???n ti???n: " + acountNumberField.getText() + "</font></center></b>");
		amountMoneyField.setVisible(true);
		amountMoneyField.setBounds(238, 120, 170, 35);
		inforLable.setVisible(true);
		inforLable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inforLable.setBounds(88, 120, 150, 35);
		inforLable.setText("                      S??? ti???n:");
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText("<b><center><font size=4 color=blue>(???n CANCEL ????? tho??t)</font></center></b>");
	}
	
	public void enterMoneyDisplay() {
		clearScreen();

		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=5 color=blue>ATM ch??? tr??? ???????c s??? ti???n l?? b???i s??? c???a"
				+ "<br>100000"
				+ "<br>Qu?? kh??ch vui l??ng nh???p s??? ti???n mu???n r??t</font></center></b>");
		amountMoneyField.setVisible(true);
		amountMoneyField.setHorizontalAlignment(JLabel.CENTER);
		amountMoneyField.setBounds(143, 120, 170, 35);
		infor2.setVisible(true);
		infor2.setBounds(5, 237, 440, 50);
		infor2.setText("<b><center><font size=5 color=blue>(S??? ti???n nh???p v??o ph???i l?? VND)"
				+ "<br>(???n CANCEL ????? tho??t)</font></center></b>");
	}

	public void tranferMoneyStep3Display(String name) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		int balance = Integer.parseInt(amountMoneyField.getText().replace(",", ""));
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" Ti???p t???c");
		menu[7].setVisible(true);
		menu[7].setText(" Tho??t");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText("<br><b><font size=5 color=blue><center>Xin vui l??ng ki???m tra l???i ????? chuy???n kho???n</center>"
				+ "<br>&emsp;TK chuy???n ?????n: &emsp;&nbsp;&nbsp;&nbsp;" + acountNumberField.getText() + ""
				+ "<br>&emsp;Kh??ch h??ng: &emsp;&emsp;&emsp;" + name + ""
				+ "<br>&emsp;S??? ti???n: &emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;" + num + " VND</font></b>");
		

	}

	public void clearDataInfor() {
		acountNumberField.setText("");
		amountMoneyField.setText("");
		pin.setText("");
	}

	public void clearScreen() {
		acountNumberField.setVisible(false);
		amountMoneyField.setVisible(false);
		inforLable.setVisible(false);
		picture.setVisible(false);
		pin.setVisible(false);
		pin.setText("");
		// icon = new ImageIcon("introduce1.jpg");
		infor1.setVisible(false);
		infor2.setVisible(false);
		for (int i = 0; i < menu.length; i++) {
			menu[i].setVisible(false);
		}
	}
	
	public void chooseMoneyDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[0].setVisible(true);
		menu[0].setText(" 100 000");
		menu[1].setVisible(true);
		menu[1].setText(" 500 000");
		menu[2].setVisible(true);
		menu[2].setText(" 1 000 000");
		menu[3].setVisible(true);
		menu[3].setText(" 1 500 000");
		menu[4].setVisible(true);
		menu[4].setText(" 2 000 00");
		menu[6].setVisible(true);
		menu[6].setText(" S??? kh??c");
		menu[7].setVisible(true);
		menu[7].setText(" Tr??? th???");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 29);
		infor1.setText(
				"<b><center><font size=5 color=blue>Xin vui l??ng l???a ch???n s??? ti???n</font></center></b>");

	}

	public JButton getLeftButton1() {
		return leftButtons[0];
	}

	public JButton getLeftButton2() {
		return leftButtons[1];
	}

	public JButton getLeftButton3() {
		return leftButtons[2];
	}

	public JButton getLeftButton4() {
		return leftButtons[3];
	}

	public JButton getRightButton1() {
		return rightButtons[0];
	}

	public JButton getRightButton2() {
		return rightButtons[1];
	}

	public JButton getRightButton3() {
		return rightButtons[2];
	}

	public JButton getRightButton4() {
		return rightButtons[3];
	}

	public void setPin(String num) {
		if (pin.getText().length() < 6) {
			pin.setText(num);
		}

	}

	public String getPin() {
		return pin.getText();
	}

	public String getAcountNumberToTranfer() {
		return acountNumberField.getText();
	}

	public void setAcountNumberToTranfer(String num) {
		if (acountNumberField.getText().length() < 15) {
			acountNumberField.setText(num);
		}
	}

	public String getAmountMoneyToTranfer() {
		return amountMoneyField.getText();
	}

	public void setAmountMoneyToTranfer(String num) {
		int amount = Integer.parseInt(num.replaceAll(",", ""));
		if (amount > 50000000) {
			amountMoneyField.setText("50,000,000");
		}
		if (!getAmountMoneyToTranfer().equals("50,000,000")) {
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);
			String n = en.format(amount);
			amountMoneyField.setText(n);
		}	

	}
	
	public void setAmountMoneyToWithdraw(String num) {
		int amount = Integer.parseInt(num.replaceAll(",", ""));
		if (amount > 5000000) {
			amountMoneyField.setText("5,000,000");
		}
		if (!getAmountMoneyToTranfer().equals("5,000,000")) {
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);
			String n = en.format(amount);
			amountMoneyField.setText(n);
		}	

	}
	
	public void clearAmountMoney() {
		amountMoneyField.setText("");
	}

	private JTextField acountNumberField, amountMoneyField;
	private JLabel inforLable;
	private JPasswordField pin;
	static ImageIcon icon;
	private JLabel picture;
	private JLabel[] menu = new JLabel[8];
	private JTextPane infor1, infor2;
	private JButton[] leftButtons = new JButton[4];
	private JButton[] rightButtons = new JButton[4];

}
