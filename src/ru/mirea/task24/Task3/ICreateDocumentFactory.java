package ru.mirea.task24.Task3;

public class ICreateDocumentFactory
{
	public IDocument createNew(ICreateDocument factory) {
		return factory.createNew();
	}

	public IDocument createOpen(ICreateDocument factory) {
		return factory.createOpen();
	}
}
