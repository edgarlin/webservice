package com.maven.plugin.demo;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@SuppressWarnings("rawtypes")
@Mojo(name = "goal2", defaultPhase = LifecyclePhase.CLEAN)
public class MavenPluginDemo2 extends AbstractMojo {

	@Parameter(property="demo.goal2.mystring")
	private String myString2;

	@Parameter(property="demo.goal2.mystring")
	private String myString;

	@Parameter
	private boolean myBoolean;

	@Parameter
	private Integer myInteger;

	@Parameter
	private Double myDouble;

	@Parameter
	private Date myDate;
	
	@Parameter
	private URL myURL;

	@Parameter
	private File myFile;
	
	@Parameter
	private String[] myArray;
	
	@Parameter
	private List myList;
	
	@Parameter
	private Map myMap;

	@Parameter
    private Properties myProperties;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		this.getLog().info("-----------demo maven plugin execute-------------:" + myString2);
	}

}
