package factoryAbstract;

import factoryAbstract.shapes.Shape;

public abstract class AbstractFactory {

	abstract Shape getShape(int type);
}
