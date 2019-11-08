package MaintenanceModel.Adapter;
import javax.xml.parsers.*;
import java.util.Scanner;      
import org.w3c.dom.*;
import java.awt.Window.Type;
import java.io.*;
//直线感应电动机弹射器适配器
public class ElectricAdapter implements Motor
{
	private ElectricMotor emotor;
	public ElectricAdapter()
	{
		emotor = new ElectricMotor();
	}
	public void drive()
	{ 
		emotor.electricDrive();
	}
}