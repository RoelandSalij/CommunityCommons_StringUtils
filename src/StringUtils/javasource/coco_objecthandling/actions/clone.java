// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package coco_objecthandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import coco_objecthandling.ORM;

/**
 * Clones objects
 * 
 * - Source: the original object to copy
 * - Target: the object to copy it into (should be of the same type, or a specialization)
 * - includeAssociations: whether to clone associations. 
 * 
 * If associated objects need to be cloned as well, use deepClone, this function only copies the references, not the reffered objects. Target is not committed automatically.
 */
public class clone extends CustomJavaAction<Boolean>
{
	private IMendixObject source;
	private IMendixObject target;
	private Boolean withAssociations;

	public clone(IContext context, IMendixObject source, IMendixObject target, Boolean withAssociations)
	{
		super(context);
		this.source = source;
		this.target = target;
		this.withAssociations = withAssociations;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return ORM.cloneObject(this.getContext(), source, target, withAssociations);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "clone";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}