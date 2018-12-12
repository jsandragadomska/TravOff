package travoff;

public class Date {
	private int rok;
	private int miesiac;
	private int dzien;
	public Date(int rok, int miesiac, int dzien) {
		this.rok = rok;
		this.miesiac = miesiac;
		this.dzien =  dzien;
	}

	public String toString() {
		return String.format("%4d/%02d/%02d",rok, miesiac, dzien);
//		return "The date: "+rok+ " " +miesiac+ " " +dzien;
	}
	public static Date of(String s, String separator) {
		String[] array = s.split(separator);
		if (array.length != 3) {
			return null;
		}
		int rok = Integer.parseInt(array[0]);
		int miesiac = Integer.parseInt(array[1]);
		int dzien = Integer.parseInt(array[2]);
		return new Date(rok, miesiac, dzien);
	}
}