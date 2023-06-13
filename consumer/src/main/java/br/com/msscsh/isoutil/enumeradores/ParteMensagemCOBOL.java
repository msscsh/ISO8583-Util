package br.com.msscsh.isoutil.enumeradores;

import java.util.Arrays;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * Com intuito de declarar as parte da mensagem para iteracao nos Builders
 * 
 */
@Getter
@AllArgsConstructor
public enum ParteMensagemCOBOL {

	IDENTIFICADO_DO_TIPO_DE_MENSAGEM(0, "IDENTIFICADOR DO TIPO DE MENSAGEM"),
	
	BIT_001_BITMAP(1, "Bitmap"),
	BIT_002_NUMERO_DO_CARTAO(2, "Primary Account Number, PAN"),
	BIT_003_CODIGO_PROCESSAMENTO(3, "Processing Code"),
	BIT_004_AMOUNT_TRANSACTION(4, "Amount Transaction"),
	BIT_005_AMOUNT_SETTLEMENT(5, "Amount, settlement"),
	
	BIT_006_AMOUNT_CARDHOLDER_BILLING(6, "Amount, cardholder billing"),
	BIT_007_TRANSMISSION_DATE_TIME(7, "Transmission date & time"),
	BIT_008_AMOUNT_CARDHOLDER_BILLING_FEE(8, "Amount, cardholder billing fee"),
	BIT_009_CONVERSION_RATE_SETTLEMENT(9, "Conversion rate, settlement"),
	BIT_010_CONVERSION_RATE_CARDHOLDER_BILLING(10, "Conversion rate, cardholder billing"),
	
	BIT_011_SYSTEM_TRACE_AUDIT_NUMBER_STAN(11, "System trace audit number (STAN)"),
	BIT_012_LOCAL_TRANSACTION_TIME_HHMMSS(12, "Local transaction time (hhmmss)"),
	BIT_013_LOCAL_TRANSACTION_DATE_MMDD(13, "Local transaction date (MMDD)"),
	BIT_014_EXPIRATION_DATE_YYMM(14, "Expiration date (YYMM)"),
	BIT_015_SETTLEMENT_DATE(15, "Settlement date"),

	BIT_016_CURRENCY_CONVERSION_DATE(16, "Currency conversion date"),
	BIT_017_CAPTURE_DATE(17, "Capture date"),
	BIT_018_MERCHANT_TYPE_OR_MERCHANT_CATEGORY_CODE(18, "Merchant type, or merchant category code"),
	BIT_019_ACQUIRING_INSTITUTION_COUNTRY_CODE(19, "Acquiring institution (country code)"),
	BIT_020_PAN_EXTENDED_COUNTRY_CODE(20, "PAN extended (country code)"),
	
	BIT_021_FORWARDING_INSTITUTION_COUNTRY_CODE(21, "Forwarding institution (country code)"),
	BIT_022_POINT_OF_SERVICE_ENTRY_MODE(22, "Point of service entry mode"),
	BIT_023_APPLICATION_PAN_SEQUENCE_NUMBER(23, "Application PAN sequence number"),
	BIT_024_FUNCTION_CODE_ISO_8583_1993_OR_NETWORK_INTERNATIONAL_IDENTIFIER_NII(24, "Function code (ISO 8583:1993), or network international identifier (NII)"),
	BIT_025_POINT_OF_SERVICE_CONDITION_CODE(25, "Point of service condition code"),

	BIT_026_POINT_OF_SERVICE_CAPTURE_CODE(26, "Point of service capture code"),
	BIT_027_AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH(27, "Authorizing identification response length"),
	BIT_028_AMOUNT_TRANSACTION_FEE(28, "Amount, transaction fee"),
	BIT_029_AMOUNT_SETTLEMENT_FEE(29, "Amount, settlement fee"),
	BIT_030_AMOUNT_TRANSACTION_PROCESSING_FEE(30, "Amount, transaction processing fee"),

	BIT_031_AMOUNT_SETTLEMENT_PROCESSING_FEE(31, "Amount, settlement processing fee"),
	BIT_032_ACQUIRING_INSTITUTION_IDENTIFICATION_CODE(32, "Acquiring institution identification code"),
	BIT_033_FORWARDING_INSTITUTION_IDENTIFICATION_CODE(33, "Forwarding institution identification code"),
	BIT_034_PRIMARY_ACCOUNT_NUMBER_EXTENDED(34, "Primary account number, extended"),
	BIT_035_TRACK_2_DATA(35, "Track 2 data"),

	BIT_036_TRACK_3_DATA(36, "Track 3 data"),
	BIT_037_RETRIEVAL_REFERENCE_NUMBER(37, "Retrieval reference number"),
	BIT_038_AUTHORIZATION_IDENTIFICATION_RESPONSE(38, "Authorization identification response"),
	BIT_039_RESPONSE_CODE(39, "Response code"),
	BIT_040_SERVICE_RESTRICTION_CODE(40, "Service restriction code"),

	BIT_041_CARD_ACCEPTOR_TERMINAL_IDENTIFICATION(41, "Card acceptor terminal identification"),
	BIT_042_CARD_ACCEPTOR_IDENTIFICATION_CODE(42, "Card acceptor identification code"),
	BIT_043_CARD_ACCEPTOR_NAME_LOCATION(43, "Card acceptor name/location (1–23 street address, –36 city, –38 state, 39–40 country)"),
	BIT_044_ADDITIONAL_RESPONSE_DATA(44, "Additional response data"),
	BIT_045_TRACK_1_DATA(45, "Track 1 data"),

	BIT_046_ADDITIONAL_DATA_ISO(46, "Additional data (ISO)"),
	BIT_047_ADDITIONAL_DATA_NATIONAL(47, "Additional data (national)"),
	BIT_048_ADDITIONAL_DATA_PRIVATE(48, "Additional data (private)"),
	BIT_049_CURRENCY_CODE_TRANSACTION(49, "Currency code, transaction"),
	BIT_050_CURRENCY_CODE_SETTLEMENT(50, "Currency code, settlement"),

	BIT_051_CURRENCY_CODE_CARDHOLDER_BILLING(51, "Currency code, cardholder billing"),
	BIT_052_PERSONAL_IDENTIFICATION_NUMBER_DATA(52, "	Personal identification number data"),
	BIT_053_SECURITY_RELATED_CONTROL_INFORMATION(53, "Security related control information"),
	BIT_054_ADDITIONAL_AMOUNTS(54, "Additional amounts"),
	BIT_055_ICC_DATA_EMV_HAVING_MULTIPLE_TAGS(55, "ICC data – EMV having multiple tags"),

	BIT_056_RESERVED_ISO(56, "Reserved (ISO)"),
	BIT_057_RESERVED_NATIONAL(57, "Reserved (national)"),
	BIT_058_RESERVED_NATIONAL(58, "Reserved (national)"),
	BIT_059_RESERVED_NATIONAL(59, "Reserved (national)"),
	BIT_060_RESERVED_NATIONAL(60, "Reserved (national) (e.g. settlement request: batch number, advice transactions: original transaction amount, batch upload: original MTI plus original RRN plus original STAN, etc.)"),

	BIT_061_RESERVED_PRIVATE(61, "Reserved (private) (e.g. CVV2/service code   transactions)"),
	BIT_062_RESERVED_PRIVATE(62, "Reserved (private) (e.g. transactions: invoice number, key exchange transactions: TPK key, etc.)"),
	BIT_063_RESERVED_PRIVATE(63, "Reserved (private)"),
	BIT_064_MESSAGE_AUTHENTICATION_CODE_MAC(64, "Message authentication code (MAC)"),
	BIT_065_EXTENDED_BITMAP_INDICATOR(65, "Extended bitmap indicator"),

	BIT_066_SETTLEMENT_CODE(66, "Settlement code"),
	BIT_067_EXTENDED_PAYMENT_CODE(67, "Extended payment code"),
	BIT_068_RECEIVING_INSTITUTION_COUNTRY_CODE(68, "Receiving institution country code"),
	BIT_069_SETTLEMENT_INSTITUTION_COUNTRY_CODE(69, "Settlement institution country code"),
	BIT_070_NETWORK_MANAGEMENT_INFORMATION_CODE(70, "Network management information code"),

	BIT_071_MESSAGE_NUMBER(71, "Message number"),
	BIT_072_LAST_MESSAGES_NUMBER(72, "Last message's number"),
	BIT_073_ACTION_DATE_YYMMDD(73, "Action date (YYMMDD)"),
	BIT_074_NUMBER_OF_CREDITS(74, "Number of credits"),
	BIT_075_CREDITS_REVERSAL_NUMBER(75, "Credits, reversal number"),

	BIT_076_NUMBER_OF_DEBITS(76, "Number of debits"),
	BIT_077_DEBITS_REVERSAL_NUMBER(77, "Debits, reversal number"),
	BIT_078_TRANSFER_NUMBER(78, "Transfer number"),
	BIT_079_TRANSFER_REVERSAL_NUMBER(79, "Transfer, reversal number"),
	BIT_080_NUMBER_OF_INQUIRIES(80, "Number of inquiries"),

	BIT_081_NUMBER_OF_AUTHORIZATIONS(81, "Number of authorizations"),
	BIT_082_CREDITS_PROCESSING_FEE_AMOUNT(82, "Credits, processing fee amount"),
	BIT_083_CREDITS_TRANSACTION_FEE_AMOUNT(83, "Credits, transaction fee amount"),
	BIT_084_DEBITS_PROCESSING_FEE_AMOUNT(84, "Debits, processing fee amount"),
	BIT_085_DEBITS_TRANSACTION_FEE_AMOUNT(85, "Debits, transaction fee amount"),

	BIT_086_TOTAL_AMOUNT_OF_CREDITS(86, "Total amount of credits"),
	BIT_087_CREDITS_REVERSAL_AMOUNT(87, "Credits, reversal amount"),
	BIT_088_TOTAL_AMOUNT_OF_DEBITS(88, "Total amount of debits"),
	BIT_089_DEBITS_REVERSAL_AMOUNT(89, "Debits, reversal amount"),
	BIT_090_ORIGINAL_DATA_ELEMENTS(90, "Original data elements"),

	BIT_091_FILE_UPDATE_CODE(91, "File update code"),
	BIT_092_FILE_SECURITY_CODE(92, "File security code"),
	BIT_093_RESPONSE_INDICATOR(93, "Response indicator"),
	BIT_094_SERVICE_INDICATOR(94, "Service indicator"),
	BIT_095_REPLACEMENT_AMOUNTS(95, "Replacement amounts"),

	BIT_096_MESSAGE_SECURITY_CODE(96, "Message security code"),
	BIT_097_NET_SETTLEMENT_AMOUNT(97, "Net settlement amount"),
	BIT_098_PAYEE(98, "Payee"),
	BIT_099_SETTLEMENT_INSTITUTION_IDENTIFICATION_CODE(99, "Settlement institution identification code"),
	BIT_100_BITMAP(100, "Receiving institution identification code"),

	BIT_101_FILE_NAME(101, "File name"),
	BIT_102_ACCOUNT_IDENTIFICATION_1(102, "Account identification 1"),
	BIT_103_ACCOUNT_IDENTIFICATION_2(103, "Account identification 2"),
	BIT_104_TRANSACTION_DESCRIPTION(104, "Transaction description"),
	BIT_105_RESERVED_FOR_ISO_USE(105, "Reserved for ISO use"),
	
	BIT_106_RESERVED_FOR_ISO_USE(106, "Reserved for ISO use"),
	BIT_107_RESERVED_FOR_ISO_USE(107, "Reserved for ISO use"),
	BIT_108_RESERVED_FOR_ISO_USE(108, "Reserved for ISO use"),
	BIT_109_RESERVED_FOR_ISO_USE(109, "Reserved for ISO use"),
	BIT_110_RESERVED_FOR_ISO_USE(110, "Reserved for ISO use"),
	
	BIT_111_RESERVED_FOR_ISO_USE(111, "Reserved for ISO use"),
	BIT_112_RESERVED_FOR_NATIONAL_USE(112, "Reserved for national use"),
	BIT_113_RESERVED_FOR_NATIONAL_USE(113, "Reserved for national use"),
	BIT_114_RESERVED_FOR_NATIONAL_USE(114, "Reserved for national use"),
	BIT_115_RESERVED_FOR_NATIONAL_USE(115, "Reserved for national use"),
	
	BIT_116_RESERVED_FOR_NATIONAL_USE(116, "Reserved for national use"),
	BIT_117_RESERVED_FOR_NATIONAL_USE(117, "Reserved for national use"),
	BIT_118_RESERVED_FOR_NATIONAL_USE(118, "Reserved for national use"),
	BIT_119_RESERVED_FOR_NATIONAL_USE(119, "Reserved for national use"),
	BIT_120_RESERVED_FOR_PRIVATE_USE(120, "Reserved for private use"),
	
	BIT_121_RESERVED_FOR_PRIVATE_USE(121, "Reserved for private use"),
	BIT_122_RESERVED_FOR_PRIVATE_USE(122, "Reserved for private use"),
	BIT_123_RESERVED_FOR_PRIVATE_USE(123, "Reserved for private use"),
	BIT_124_RESERVED_FOR_PRIVATE_USE(124, "Reserved for private use"),
	BIT_125_RESERVED_FOR_PRIVATE_USE(125, "Reserved for private use"),
	
	BIT_126_RESERVED_FOR_PRIVATE_USE(126, "Reserved for private use"),
	BIT_127_RESERVED_FOR_PRIVATE_USE(127, "Reserved for private use"),
	BIT_128_MESSAGE_AUTHENTICATION_CODE(128, "Message authentication code"),
	

	BIT_130_MESSAGE_AUTHENTICATION_CODE(130, "Message authentication code"),
	BIT_131_MESSAGE_AUTHENTICATION_CODE(131, "Message authentication code"),
	BIT_132_MESSAGE_AUTHENTICATION_CODE(132, "Message authentication code"),
	BIT_133_MESSAGE_AUTHENTICATION_CODE(133, "Message authentication code"),
	BIT_134_MESSAGE_AUTHENTICATION_CODE(134, "Message authentication code"),
	BIT_135_MESSAGE_AUTHENTICATION_CODE(135, "Message authentication code"),
	BIT_136_MESSAGE_AUTHENTICATION_CODE(136, "Message authentication code"),
	BIT_137_MESSAGE_AUTHENTICATION_CODE(137, "Message authentication code"),
	BIT_138_MESSAGE_AUTHENTICATION_CODE(138, "Message authentication code"),
	BIT_139_MESSAGE_AUTHENTICATION_CODE(139, "Message authentication code"),
	
	BIT_142_MESSAGE_AUTHENTICATION_CODE(142, "Message authentication code"),
	BIT_143_MESSAGE_AUTHENTICATION_CODE(143, "Message authentication code"),
	BIT_144_MESSAGE_AUTHENTICATION_CODE(144, "Message authentication code"),
	BIT_145_MESSAGE_AUTHENTICATION_CODE(145, "Message authentication code"),
	BIT_146_MESSAGE_AUTHENTICATION_CODE(146, "Message authentication code"),
	BIT_147_MESSAGE_AUTHENTICATION_CODE(147, "Message authentication code"),
	BIT_148_MESSAGE_AUTHENTICATION_CODE(148, "Message authentication code"),
	BIT_149_MESSAGE_AUTHENTICATION_CODE(149, "Message authentication code"),
	BIT_150_MESSAGE_AUTHENTICATION_CODE(150, "Message authentication code"),
	BIT_151_MESSAGE_AUTHENTICATION_CODE(151, "Message authentication code"),
	BIT_152_MESSAGE_AUTHENTICATION_CODE(152, "Message authentication code");
	
	
	int numeroDaParte;
	String nomeDaParte;

	public static String buscarNomeEnumDoBit(int bit) {
	    return Arrays.stream(ParteMensagemCOBOL.values())
	            .filter(entrada -> entrada.numeroDaParte == bit)
	            .collect(Collectors.toList())
	            .get(0)
	            .name();
	}
	
}
