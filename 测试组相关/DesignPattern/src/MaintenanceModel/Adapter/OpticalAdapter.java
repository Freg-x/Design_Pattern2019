package MaintenanceModel.Adapter;
import javax.xml.parsers.*;
import java.util.Scanner;      
import org.w3c.dom.*;
import java.awt.Window.Type;
import java.io.*;
//水压动力轮弹射器适配器
public class OpticalAdapter implements Motor
{
	private OpticalMotor omotor;
	public OpticalAdapter()
	{
		omotor = new OpticalMotor();
	}
	public void drive()
	{
		omotor.opticalDrive();
	}
}