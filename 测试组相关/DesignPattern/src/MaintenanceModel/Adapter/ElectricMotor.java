package MaintenanceModel.Adapter;
import javax.xml.parsers.*;
import java.util.Scanner;      
import org.w3c.dom.*;
import java.awt.Window.Type;
import java.io.*;
//适配者1：直线感应电动机弹射器
public class ElectricMotor
{
	public void electricDrive()
	{
		System.out.println("ElectricMotor:electricDrive():Linear induction motor catapult");
	}
}