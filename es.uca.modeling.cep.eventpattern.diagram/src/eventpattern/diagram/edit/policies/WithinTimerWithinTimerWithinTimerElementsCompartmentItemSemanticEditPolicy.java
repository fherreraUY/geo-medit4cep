/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.Addition2CreateCommand;
import eventpattern.diagram.edit.commands.And2CreateCommand;
import eventpattern.diagram.edit.commands.Contains2CreateCommand;
import eventpattern.diagram.edit.commands.Diference2CreateCommand;
import eventpattern.diagram.edit.commands.Distance2CreateCommand;
import eventpattern.diagram.edit.commands.Division2CreateCommand;
import eventpattern.diagram.edit.commands.Equal2CreateCommand;
import eventpattern.diagram.edit.commands.Equals2CreateCommand;
import eventpattern.diagram.edit.commands.Event2CreateCommand;
import eventpattern.diagram.edit.commands.EventProperty4CreateCommand;
import eventpattern.diagram.edit.commands.Every2CreateCommand;
import eventpattern.diagram.edit.commands.EveryDistinct2CreateCommand;
import eventpattern.diagram.edit.commands.FollowedBy2CreateCommand;
import eventpattern.diagram.edit.commands.GeoValue2CreateCommand;
import eventpattern.diagram.edit.commands.GreaterEqual2CreateCommand;
import eventpattern.diagram.edit.commands.GreaterThan2CreateCommand;
import eventpattern.diagram.edit.commands.Intersection2CreateCommand;
import eventpattern.diagram.edit.commands.Intersects2CreateCommand;
import eventpattern.diagram.edit.commands.LessEqual2CreateCommand;
import eventpattern.diagram.edit.commands.LessThan2CreateCommand;
import eventpattern.diagram.edit.commands.Modulus2CreateCommand;
import eventpattern.diagram.edit.commands.Multiplication2CreateCommand;
import eventpattern.diagram.edit.commands.Not2CreateCommand;
import eventpattern.diagram.edit.commands.NotEqual2CreateCommand;
import eventpattern.diagram.edit.commands.Or2CreateCommand;
import eventpattern.diagram.edit.commands.Point2CreateCommand;
import eventpattern.diagram.edit.commands.Range2CreateCommand;
import eventpattern.diagram.edit.commands.Repeat2CreateCommand;
import eventpattern.diagram.edit.commands.Subtraction2CreateCommand;
import eventpattern.diagram.edit.commands.Union2CreateCommand;
import eventpattern.diagram.edit.commands.Until2CreateCommand;
import eventpattern.diagram.edit.commands.Value2CreateCommand;
import eventpattern.diagram.edit.commands.While2CreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class WithinTimerWithinTimerWithinTimerElementsCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WithinTimerWithinTimerWithinTimerElementsCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.WithinTimer_2030);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.Contains_3061 == req.getElementType()) {
			return getGEFWrapper(new Contains2CreateCommand(req));
		}
		if (EventpatternElementTypes.And_3003 == req.getElementType()) {
			return getGEFWrapper(new And2CreateCommand(req));
		}
		if (EventpatternElementTypes.Or_3004 == req.getElementType()) {
			return getGEFWrapper(new Or2CreateCommand(req));
		}
		if (EventpatternElementTypes.Not_3005 == req.getElementType()) {
			return getGEFWrapper(new Not2CreateCommand(req));
		}
		if (EventpatternElementTypes.Union_3062 == req.getElementType()) {
			return getGEFWrapper(new Union2CreateCommand(req));
		}
		if (EventpatternElementTypes.Intersection_3075 == req.getElementType()) {
			return getGEFWrapper(new Intersection2CreateCommand(req));
		}
		if (EventpatternElementTypes.Diference_3064 == req.getElementType()) {
			return getGEFWrapper(new Diference2CreateCommand(req));
		}
		if (EventpatternElementTypes.Distance_3065 == req.getElementType()) {
			return getGEFWrapper(new Distance2CreateCommand(req));
		}
		if (EventpatternElementTypes.Equals_3066 == req.getElementType()) {
			return getGEFWrapper(new Equals2CreateCommand(req));
		}
		if (EventpatternElementTypes.Intersects_3067 == req.getElementType()) {
			return getGEFWrapper(new Intersects2CreateCommand(req));
		}
		if (EventpatternElementTypes.Addition_3006 == req.getElementType()) {
			return getGEFWrapper(new Addition2CreateCommand(req));
		}
		if (EventpatternElementTypes.Subtraction_3007 == req.getElementType()) {
			return getGEFWrapper(new Subtraction2CreateCommand(req));
		}
		if (EventpatternElementTypes.Multiplication_3008 == req.getElementType()) {
			return getGEFWrapper(new Multiplication2CreateCommand(req));
		}
		if (EventpatternElementTypes.Division_3009 == req.getElementType()) {
			return getGEFWrapper(new Division2CreateCommand(req));
		}
		if (EventpatternElementTypes.Modulus_3010 == req.getElementType()) {
			return getGEFWrapper(new Modulus2CreateCommand(req));
		}
		if (EventpatternElementTypes.Equal_3011 == req.getElementType()) {
			return getGEFWrapper(new Equal2CreateCommand(req));
		}
		if (EventpatternElementTypes.NotEqual_3012 == req.getElementType()) {
			return getGEFWrapper(new NotEqual2CreateCommand(req));
		}
		if (EventpatternElementTypes.LessThan_3013 == req.getElementType()) {
			return getGEFWrapper(new LessThan2CreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterThan_3014 == req.getElementType()) {
			return getGEFWrapper(new GreaterThan2CreateCommand(req));
		}
		if (EventpatternElementTypes.LessEqual_3015 == req.getElementType()) {
			return getGEFWrapper(new LessEqual2CreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterEqual_3016 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqual2CreateCommand(req));
		}
		if (EventpatternElementTypes.Every_3017 == req.getElementType()) {
			return getGEFWrapper(new Every2CreateCommand(req));
		}
		if (EventpatternElementTypes.EveryDistinct_3018 == req.getElementType()) {
			return getGEFWrapper(new EveryDistinct2CreateCommand(req));
		}
		if (EventpatternElementTypes.Repeat_3019 == req.getElementType()) {
			return getGEFWrapper(new Repeat2CreateCommand(req));
		}
		if (EventpatternElementTypes.Until_3020 == req.getElementType()) {
			return getGEFWrapper(new Until2CreateCommand(req));
		}
		if (EventpatternElementTypes.Range_3021 == req.getElementType()) {
			return getGEFWrapper(new Range2CreateCommand(req));
		}
		if (EventpatternElementTypes.FollowedBy_3022 == req.getElementType()) {
			return getGEFWrapper(new FollowedBy2CreateCommand(req));
		}
		if (EventpatternElementTypes.While_3023 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (EventpatternElementTypes.Point_3079 == req.getElementType()) {
			return getGEFWrapper(new Point2CreateCommand(req));
		}
		if (EventpatternElementTypes.Event_3024 == req.getElementType()) {
			return getGEFWrapper(new Event2CreateCommand(req));
		}
		if (EventpatternElementTypes.EventProperty_3025 == req.getElementType()) {
			return getGEFWrapper(new EventProperty4CreateCommand(req));
		}
		if (EventpatternElementTypes.Value_3026 == req.getElementType()) {
			return getGEFWrapper(new Value2CreateCommand(req));
		}
		if (EventpatternElementTypes.GeoValue_3077 == req.getElementType()) {
			return getGEFWrapper(new GeoValue2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
