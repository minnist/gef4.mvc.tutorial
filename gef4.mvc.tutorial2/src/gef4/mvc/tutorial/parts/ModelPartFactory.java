package gef4.mvc.tutorial.parts;

import java.util.Map;

import org.eclipse.gef.mvc.behaviors.IBehavior;
import org.eclipse.gef.mvc.parts.IContentPart;
import org.eclipse.gef.mvc.parts.IContentPartFactory;

import com.google.inject.Inject;
import com.google.inject.Injector;

import gef4.mvc.tutorial.model.Model;
import javafx.scene.Node;

public class ModelPartFactory implements IContentPartFactory<Node> {

	@Inject
	private Injector injector;

	@Override
	public IContentPart<Node, ? extends Node> createContentPart(Object content, IBehavior<Node> contextBehavior,
			Map<Object, Object> contextMap) {

		if (content instanceof Model) {
			return injector.getInstance(ModelPart.class);
		} else {
			throw new IllegalArgumentException(content.getClass().toString());
		}
	};

}
