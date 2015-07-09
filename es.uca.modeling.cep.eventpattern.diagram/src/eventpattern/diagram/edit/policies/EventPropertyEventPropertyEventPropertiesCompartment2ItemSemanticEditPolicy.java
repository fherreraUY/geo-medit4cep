/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.EventProperty3CreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy() {
		super(EventpatternElementTypes.EventProperty_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.EventProperty_3002 == req.getElementType()) {
			return getGEFWrapper(new EventProperty3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
