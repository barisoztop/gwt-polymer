package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TodoList implements EntryPoint {

	@Override
	public void onModuleLoad() {

		Polymer.importHref("iron-icons/iron-icons.html", new Function() {
	        public Object call(Object arg) {
	            // The app is executed when all imports succeed.
	            startApplication();
	            return null;
	        }
	    });
	  }

	  private void startApplication() {
	    RootPanel.get().add(new Main());
	  }

}

