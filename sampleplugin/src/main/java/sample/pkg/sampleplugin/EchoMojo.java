package sample.pkg.sampleplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Echos an object string to the output screen.
 * 
 * @goal echo
 * @requiresProject false
 */
@Mojo(name = "echo", defaultPhase = LifecyclePhase.CLEAN)
public class EchoMojo extends AbstractMojo {
	/*
	 * <project> 
	 *   ... 
	 *   <properties>
	 *     <echo.message>Hello Everybody</echo.message>
	 *   </properties>
	 *   ...
	 *   <build>
           <plugins>
             <plugin>
               <groupId>...</groupId>
               <artifactId>...</artifactId>
               <version>..</version>
               <configuration>
                 <message>Hello Everybody!</message>
               </configuration>
             </plugin>
           </plugins>
         </build>
         ...
	 * </project>
	 */
	@Parameter(defaultValue = "${echo.message}", property = "message", required = true)
	private Object message;

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info(message.toString());
	}
}