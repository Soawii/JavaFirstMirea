package ru.mirea.task24.Task3;

public class ICreateImage implements ICreateDocument
{
	String image;

	public ICreateImage(String image) {
		this.image = image;
	}

	@Override
	public IDocument createNew()
	{
		return new ImageDocument(image);
	}

	@Override
	public IDocument createOpen()
	{
		return new ImageDocument(image);
	}
}

