// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objecthandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import objecthandling.ORM;

/**
 * Clones objects, their associations and even referred objects. 
 * 
 * - Source: the original object to copy
 * - Target: the object to copy it into (should be of the same type, or a specialization)
 * - MembersToSkip: members which should not  be set at all
 * - MembersToKeep: references which should be set, but not cloned. (so source and target will refer to exactly the same object). If an association is not part of this property, it will be cloned.
 * - ReverseAssociations: 1 - 0 assications which refer to target, which will be cloned as well. Only the reference name itself needs to be mentioned.
 * - excludeEntities: entities that will not be cloned. references to these entities will refer to the same object as the source did.
 * - excludeModules: modules that will have none of their enities cloned. Behaves similar to excludeEntities.
 * 
 * members format: <membername> or <module.association> or <module.objecttype/membername>, where objecttype is the concrete type of the object being cloned. 
 * 
 * reverseAssociation: 
 * <module.relation>
 * 
 * membersToSkip by automatically contains createdDate and changedDate. 
 * membersToKeep by automatically contains System.owner and System.changedBy
 * 
 * Note that DeepClone does commit all objects, where Clone does not.
 */
public class deepClone extends CustomJavaAction<Boolean>
{
	private IMendixObject source;
	private IMendixObject target;
	private String membersToSkip;
	private String membersToKeep;
	private String reverseAssociations;
	private String excludeEntities;
	private String excludeModules;

	public deepClone(IContext context, IMendixObject source, IMendixObject target, String membersToSkip, String membersToKeep, String reverseAssociations, String excludeEntities, String excludeModules)
	{
		super(context);
		this.source = source;
		this.target = target;
		this.membersToSkip = membersToSkip;
		this.membersToKeep = membersToKeep;
		this.reverseAssociations = reverseAssociations;
		this.excludeEntities = excludeEntities;
		this.excludeModules = excludeModules;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        this.membersToSkip       = this.membersToSkip == null       ? "" : this.membersToSkip;
        this.membersToKeep       = this.membersToKeep == null       ? "" : this.membersToKeep;
        this.reverseAssociations = this.reverseAssociations == null ? "" : this.reverseAssociations;
        this.excludeEntities     = this.excludeEntities == null     ? "" : this.excludeEntities;
        this.excludeModules      = this.excludeModules == null      ? "" : this.excludeModules;
	    
		ORM.deepClone(getContext(), source, target, membersToSkip, membersToKeep, reverseAssociations, excludeEntities, excludeModules);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "deepClone";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
