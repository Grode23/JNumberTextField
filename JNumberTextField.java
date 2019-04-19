import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class JNumberTextField extends JTextField {

	private static final long serialVersionUID = 1L;

	public JNumberTextField() {	
		this.setDocument(new NumberDocument());
	}
	
	public JNumberTextField(Document doc, String text, int columns) {
		super(doc, text, columns);
		this.setDocument(new NumberDocument());
	}

	public JNumberTextField(int columns) {
		super(columns);
		this.setDocument(new NumberDocument());
	}

	public JNumberTextField(String text, int columns) {
		super(text, columns);
		this.setDocument(new NumberDocument());
	}

	public JNumberTextField(String text) {
		super(text);
		this.setDocument(new NumberDocument());
	}

	public class NumberDocument extends PlainDocument {

		private static final long serialVersionUID = 1L;

		@Override
		public void insertString(int offset, String str, AttributeSet set) throws BadLocationException {
			if(str.equals(null))
				return;
			else if (Character.isDigit(str.charAt(str.length()-1)))
				super.insertString(offset, str, set);
		}
				
	}
	
}