/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Point#getX <em>X</em>}</li>
 *   <li>{@link eventpattern.Point#getY <em>Y</em>}</li>
 *   <li>{@link eventpattern.Point#getSrs <em>Srs</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getPoint()
 * @model annotation="gmf.node figure='rounded' label='value' label.text='' label.icon='false' margin='0' border.color='110,110,110' border.width='3' size='30,30' tool.name='Point' tool.description='Add a Point'"
 * @generated
 */
public interface Point extends GeoValue {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see eventpattern.EventpatternPackage#getPoint_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link eventpattern.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see eventpattern.EventpatternPackage#getPoint_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link eventpattern.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Srs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs</em>' attribute.
	 * @see #setSrs(String)
	 * @see eventpattern.EventpatternPackage#getPoint_Srs()
	 * @model
	 * @generated
	 */
	String getSrs();

	/**
	 * Sets the value of the '{@link eventpattern.Point#getSrs <em>Srs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs</em>' attribute.
	 * @see #getSrs()
	 * @generated
	 */
	void setSrs(String value);

} // Point
