package com.nt.product;

import com.nt.foundation.Foundation;
import com.nt.interior.Interior;
import com.nt.roofing.Roofing;
import com.nt.structure.Structure;
 //product class
public class House {
	  // alt+shift+s ,r  --> for getters & setters
	private Foundation foundation;
	private Structure  structure;
	private Roofing roofing;
	private Interior interior;
	public Foundation getFoundation() {
		return foundation;
	}
	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}
	public Structure getStructure() {
		return structure;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	public Roofing getRoofing() {
		return roofing;
	}
	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	
	@Override   //  alt +shift +s ,s
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roofing=" + roofing + ", interior="
				+ interior + "]";
	}
	
	

}
