package com.dnxy.lhj.command_pattern;
/**
 * ����
 * @author Administrator
 *
 */
public class General {
	private Command undoCommand;
	private Command attackCommand;
	
	
	public General()
	{
		//����ʿ��
		Soldier soldier=new Soldier();
		//��������
		Army army=new Army(soldier);
		undoCommand=new UndoCommand(army);
		attackCommand =new AttachCommand(army);
	}
	/**
	 * �ʵ۵��ô󳼹�������
	 */
	public void attach()
	{
		attackCommand.excute();
	}
	public  void  undo()
	{
		undoCommand.back();
	}
	
}
