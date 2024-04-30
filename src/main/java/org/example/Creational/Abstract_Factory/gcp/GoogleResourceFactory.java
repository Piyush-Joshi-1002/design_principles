package org.example.Creational.Abstract_Factory.gcp;


import org.example.Creational.Abstract_Factory.Instance;
import org.example.Creational.Abstract_Factory.ResourceFactory;
import org.example.Creational.Abstract_Factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
