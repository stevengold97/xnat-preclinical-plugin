/*
 * GENERATED FILE
 * Created on Wed Aug 09 11:56:09 BST 2017
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface IcrPreclinicaldemographicdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the species.
	 */
	public String getSpecies();

	/**
	 * Sets the value for species.
	 * @param v Value to Set.
	 */
	public void setSpecies(String v);

	/**
	 * @return Returns the genotype.
	 */
	public String getGenotype();

	/**
	 * Sets the value for genotype.
	 * @param v Value to Set.
	 */
	public void setGenotype(String v);

	/**
	 * @return Returns the tumourType.
	 */
	public String getTumourtype();

	/**
	 * Sets the value for tumourType.
	 * @param v Value to Set.
	 */
	public void setTumourtype(String v);
}
