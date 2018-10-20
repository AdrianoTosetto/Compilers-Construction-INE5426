class Utils{
	private static String INT_PATTERN = "('-')?[0-9]+";
	private static String STRING_PATTERN = "";
	private static String BOOLEAN_PATTERN = "";
	private static String FLOAT_PATTERN = "";
	private static String DOUBLE_PATTERN = "";

	public static boolean isInteger(String integer) {

		return integer.matches(Utils.INT_PATTERN);
	}
}