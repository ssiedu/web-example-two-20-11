package com.ssi;

import org.springframework.stereotype.Service;

@Service
public class CylinderService {

	public void calculate(Cylinder cylinder) {
		
		
		double area=2*3.14*cylinder.getRadius()*cylinder.getHeight();	//2*pi*r*h
		double volume=3.14*cylinder.getRadius()*cylinder.getRadius()*cylinder.getHeight();	//pi*r*r*h
		
		cylinder.setArea(area);
		cylinder.setVolume(volume);
			
	}
}
