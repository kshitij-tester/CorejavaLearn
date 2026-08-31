package deviceBeans;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		
		DeviceBean d=new DeviceBean();
		
		System.out.println("Enter Device ID:-");
		d.setDeviceID(sc.nextInt());
		
		System.out.println("Enter device Name:-");
		d.setDeviceName(sc.next());
		
		System.out.println("Enter Device OS:-");
		d.setDeviceOS(sc.next());
		
		System.out.println("Enter Kernal Version");
		d.setKernalVersion(sc.nextDouble());
		
		System.out.println("Enter Manf Date:-");
		d.setManf_Date(sc.next());
		
		System.out.println("Enter IMEI CODE:-");
		d.setIMEI_Code(sc.nextInt());
		
		System.out.println("Enter RAM DETAILS:-");
		d.setRAM_Details(sc.next());
		
		System.out.println("Enter Device Type:-");
		d.setDeviceType(sc.next());
		
		System.out.println("Enter Password");
		d.setPassword(sc.next());
		
		System.out.println("Enter Confirm password:-");
		d.setConfirm_password(sc.next());
		
		
		if(d.getPassword().equals(d.getConfirm_password()))
		{
			System.out.println("Device ID:- "+d.getDeviceID());
			System.out.println("Device Name:- "+d.getDeviceName());
			System.out.println("Device OS:- "+d.getDeviceOS());
			System.out.println("Device Kernal Version:- "+d.getKernalVersion());
			System.out.println("Device Manf date:- "+d.getManf_Date());
			System.out.println("IMEI Code:- "+d.getIMEI_Code());
			System.out.println("RAM Details:- "+d.getRAM_Details());
			System.out.println("Device Type:- "+d.getDeviceType());
			
			
		}
		else
		{
			System.out.println("Password entered is incorrect");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
