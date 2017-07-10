// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package stringutils.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

import stringutils.StringUtils;

/**
 * Returns true if a value matches a regular expression. 
 * An alternative is to use the isMatch() function directly in a microflow (create or change) activity.
 * 
 * For the regexp specification see:
 * http://download.oracle.com/javase/1.4.2/docs/api/java/util/regex/Pattern.html
 * 
 */
public class RegexTest extends CustomJavaAction<Boolean>
{
	private String value;
	private String regex;

	public RegexTest(IContext context, String value, String regex)
	{
		super(context);
		this.value = value;
		this.regex = regex;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.regexTest(value, regex);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RegexTest";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
