package ru.mirea.task24.Task3;

public class main
{
	public static void main(String[] args) {
		ICreateDocumentFactory documentFactory = new ICreateDocumentFactory();

		TextDocument text = (TextDocument)documentFactory.createNew(new ICreateText("new_text"));
		MusicDocument music = (MusicDocument) documentFactory.createOpen(new ICreateMusic("new music"));
		ImageDocument image = (ImageDocument) documentFactory.createOpen(new ICreateMusic("new image"));
	}
}
