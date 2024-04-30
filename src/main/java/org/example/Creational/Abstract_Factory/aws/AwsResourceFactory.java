package org.example.Creational.Abstract_Factory.aws;

import org.example.Creational.Abstract_Factory.Instance;
import org.example.Creational.Abstract_Factory.ResourceFactory;
import org.example.Creational.Abstract_Factory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
