package com.xworkz.engineer;

import com.xworkz.engineer.csengineer.CsEngineer;
import com.xworkz.engineer.eeengineer.EEEngineer;
import com.xworkz.engineer.electronicengineer.ElectronicEngineer;
import com.xworkz.engineer.isengineer.IsEngineer;
import com.xworkz.engineer.mechanicalengineer.MechEngineer;

public class TestEngineer {

	public static void main(String[] args) {

		Engineer engineer = new Engineer();
		engineer.setUsn("3vc16ec104");
		System.out.println(engineer.getUsn());

		CsEngineer.codeing();
		ElectronicEngineer.AnalyseCircuits();
		IsEngineer.collectInformation();
		IsEngineer.codeing();
		EEEngineer.powerMan();
		EEEngineer.AnalyseCircuits();
		MechEngineer.mechanic();

	}

}
