package org.boomslang.wireframesketcher.model.interfaces;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

import org.junit.Test;

import com.wireframesketcher.model.BooleanSelectionSupport;
import com.wireframesketcher.model.ClickSupport;
import com.wireframesketcher.model.DoubleClickSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.TextInputSupport;

/**
 * 
 * @author buender
 *
 */
public class MarkerInterfaceTest extends TestCase {
	
	//ClickSupport tests
	@Test
	public void testButtonClickSupport(){
		assertThat(ModelFactory.eINSTANCE.createButton(), instanceOf(ClickSupport.class));
	}

	@Test
	public void testTableClickSupport(){
		assertThat(ModelFactory.eINSTANCE.createTable(), instanceOf(ClickSupport.class));
	}
	
	//SelectionSupport tests
	@Test
	public void testComboSelectionSupport(){
		assertThat(ModelFactory.eINSTANCE.createCombo(), instanceOf(SelectionSupport.class));
	}
	
	@Test
	public void testTableSelectionSupport(){
		assertThat(ModelFactory.eINSTANCE.createTable(), instanceOf(SelectionSupport.class));
	}
	
	//TextInputSupport tests
	@Test
	public void testTableTextInputSupport(){
		assertThat(ModelFactory.eINSTANCE.createTable(), instanceOf(TextInputSupport.class));
	}
	@Test
	public void testTextFieldTextInputSupport(){
		assertThat(ModelFactory.eINSTANCE.createTextField(), instanceOf(TextInputSupport.class));
	}
	
	//DoubleClickSupport tests
	@Test
	public void testTableDoubleClickSupport(){
		assertThat(ModelFactory.eINSTANCE.createTable(), instanceOf(DoubleClickSupport.class));
	}
	
	//BooleanSelectSelectionSupport
	@Test
	public void testCheckboxBooleanSelectSupport(){
		assertThat(ModelFactory.eINSTANCE.createCheckbox(), instanceOf(BooleanSelectionSupport.class));
	}
	
	@Test
	public void testRadioButtongBooleanSelectSupport(){
		assertThat(ModelFactory.eINSTANCE.createRadioButton(), instanceOf(BooleanSelectionSupport.class));
	}
	
}
