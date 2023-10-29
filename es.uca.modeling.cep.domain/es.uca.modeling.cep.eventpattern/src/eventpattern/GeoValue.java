/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.GeoValue#getValue <em>Value</em>}</li>
 *   <li>{@link eventpattern.GeoValue#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getGeoValue()
 * @model annotation="gmf.node figure='rounded' label='value' label.text='' label.icon='false' margin='0' border.color='110,110,110' border.width='3' size='30,30' tool.name='GeoValue' tool.description='Add a geo value'"
 * @generated
 */
public interface GeoValue extends ConditionOperand {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eventpattern.EventpatternPackage#getGeoValue_Value()
	 * @model default=" "
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eventpattern.GeoValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see eventpattern.EventpatternPackage#getGeoValue_Type()
	 * @model
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link eventpattern.GeoValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

} // GeoValue
