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
 * Use this function to convert HTML text to plain text. 
 * It will preserve linebreaks but strip all other markup. including html entity decoding.
 */
public class HTMLToPlainText extends CustomJavaAction<String>
{
	private String html;

	public HTMLToPlainText(IContext context, String html)
	{
		super(context);
		this.html = html;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.HTMLToPlainText(html);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "HTMLToPlainText";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
