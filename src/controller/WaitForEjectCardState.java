package controller;

import javax.swing.SwingUtilities;

import view.AtmMachine;

public class WaitForEjectCardState extends AtmState {

	public WaitForEjectCardState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickClearButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickSersionButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickBillButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickCardButton() {
		atm.getScreen().thankdisplay();
		atm.getTakeAndReceivePart().setHasOrNotCard("Chưa có thẻ");
		atm.getTakeAndReceivePart().getCardReader().noCard();
		atm.getConnect().setAtmState(new NoCardState(atm));
		Runnable setTextRun = new Runnable() {
			public void run() {
				try {
					Thread.sleep(2000);
					
					atm.getScreen().introducedisplay();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		SwingUtilities.invokeLater(setTextRun);

	}

	@Override
	public void clickCashButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLeft1Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLeft2Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLeft3Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLeft4Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickRight1Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickRight2Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickRight3Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickRight4Button() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton5() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton6() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton7() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton9() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton0() {
		// TODO Auto-generated method stub

	}

}
