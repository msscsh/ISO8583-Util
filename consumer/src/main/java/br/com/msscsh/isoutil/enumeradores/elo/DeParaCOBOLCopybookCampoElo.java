package br.com.msscsh.isoutil.enumeradores.elo;

import static br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL.BIT_043_CARD_ACCEPTOR_NAME_LOCATION;
import static br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL.IDENTIFICADO_DO_TIPO_DE_MENSAGEM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL;
import lombok.AllArgsConstructor;

/**
 * 
 * Com inutito de agrupar as parte da mensagem, com seus dados que podem variar
 * 
 */
@AllArgsConstructor
public enum DeParaCOBOLCopybookCampoElo {

	//IDENTIFICADO_DO_TIPO_DE_MENSAGEM
    BIT0_IDTM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "ASZLO015-IDTM", 1, 4, 0),
    BIT1_MAPA_BIT_EXTENDIDO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MAPA-BIT-EXT", 1, 192, 0),
    BIT1_MAPA_BITS_PRIMARIO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MAPA-BITS-PRIMARIO", 2, 16, 0),
    BIT1_MAPA_BITS_SECUNDARIO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MAPA-BITS-SECUNDARIO", 3, 16, 0),
    BIT2_LONG_TJT_PAN_NU(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-TJT-PAN-NU", 1, 2, 0),
    BIT2_TJT_PAN_NU(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TJT-PAN-NU", 2, 19, 0),
    BIT3_CODPRC_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODPRC-PREST", 1, 1, 0),
    BIT3_CODPRC_12(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODPRC-12", 2, 2, 0),
    BIT3_CODPRC_34(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODPRC-34", 3, 2, 0),
    BIT3_CODPRC_56(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODPRC-56", 4, 2, 0),
    BIT4_IMPORTE_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPORTE-PREST", 1, 1, 0),
    BIT4_IMPORTE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPORTE", 2, 12, 0),
    BIT5_IMP_MOE_LIQ_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-LIQ-PREST", 1, 1, 0),
    BIT5_IMP_MOE_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-LIQ", 2, 12, 0),
    BIT6_IMP_MOE_EMIS_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-EMIS-PREST", 1, 1, 0),
    BIT6_IMP_MOE_EMIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-EMIS", 2, 12, 0),
    BIT7_FEC_TRANS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FEC-TRANS", 1, 4, 0),
    BIT7_HOR_TRANS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "HOR-TRANS", 2, 6, 0),
    BIT8_IMP_MOE_PORT_DEC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-PORT-DEC", 1, 1, 0),
    BIT8_IMP_MOE_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-MOE-PORT", 2, 7, 0),
    BIT9_TAX_MOE_LIQ_DEC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-LIQ-DEC", 1, 1, 0),
    BIT9_TAX_MOE_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-LIQ", 2, 7, 0),
    BIT9_TAX_MOE_LIQ_DEC2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-LIQ-DEC", 3, 1, 0),
    BIT9_TAX_MOE_LIQ2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-LIQ", 4, 7, 0),
    BIT10_TAX_MOE_PORT_DEC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-PORT-DEC", 1, 1, 0),
    BIT10_TAX_MOE_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-PORT", 2, 7, 0),
    BIT10_TAX_MOE_PORT_DEC2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-PORT-DEC", 3, 1, 0),
    BIT10_TAX_MOE_PORT2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TAX-MOE-PORT", 4, 7, 0),
    BIT11_IDETRANS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS", 1, 6, 0),
    BIT12_HOPEORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "HOPEORI", 1, 6, 0),
    BIT13_FOPEORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FOPEORI", 1, 4, 0),
    BIT14_FCADUCID(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FCADUCID", 1, 4, 0),
    BIT15_DATA_LIQUIDA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DATA-LIQUIDA", 1, 4, 0),
    BIT16_DATA_CONVER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DATA_CONVER", 1, 4, 0),
    BIT18_CODACT_EST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODACT-EST", 1, 4, 0),
    BIT19_COD_PAIS_ADQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODACT-EST", 1, 3, 0),
    BIT22_PNT_SERV_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "PNT-SERV-PREST", 1, 1, 0),
    BIT22_DAT_PNT_SERV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DAT_PNT_SERV", 2, 3, 0),
    BIT22_MODO_ENT_PAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MODO-ENT-PAN", 3, 3, 0),
    BIT22_MOD_ENT_PAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MOD-ENT-PAN", 4, 3, 0),
    BIT22_MODO_ENT_PIN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "MODO-ENT-PIN", 5, 1, 0),
    BIT23_NUMTAR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUMTAR", 1, 3, 0),
    BIT24_COD_FUNCAO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-FUNCAO", 1, 3, 0),
    BIT25_COD_MOTIV_MSG_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-MOTIV-MSG-PREST", 1, 1, 0),
    BIT25_COD_MOTIV_MSG(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-MOTIV-MSG", 2, 2, 0),
    BIT26_COD_CAPT_PIN_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-CAPT-PIN-PREST", 1, 1, 0),
    BIT26_COD_CAPT_PIN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-CAPT-PIN", 2, 2, 0),
    BIT28_VAL_TAXA_TRN_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VAL-TAXA-TRN-PREST", 1, 1, 0),
    BIT28_TIPO_TAXA_TRN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TIPO-TAXA-TRN", 2, 1, 0),
    BIT28_VAL_TAXA_TRN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VAL-TAXA-TRN", 3, 8, 0),
    BIT29_VAL_TAXA_LIQ_PREST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VAL-TAXA-LIQ-PREST", 1, 1, 0),
    BIT29_TIPO_TAXA_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VAL-TAXA-LIQ-PREST", 2, 1, 0),
    BIT29_VAL_TAXA_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VAL-TAXA-LIQ", 3, 8, 0),
    BIT32_LONG_IDENADQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IDENADQ", 1, 2, 0),
    BIT32_IDENADQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDENADQ", 2, 11, 0),
    BIT33_LONG_IDENREPA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IDENREPA", 1, 2, 0),
    BIT33_IDENREPA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDENREPA", 2, 11, 0),
    BIT35_LONG_DAPISTA2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAPISTA2", 1, 2, 0),
    BIT35_DAPISTA2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DAPISTA2", 2, 40, 0),
    BIT36_LONG_TRILHA3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-TRILHA3", 1, 2, 0),
    BIT36_TRILHA3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRILHA3", 2, 40, 0),
    BIT37_NUM_REF(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUM-REF", 1, 12, 0),
    BIT38_NUM_AUTORIZA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUM-AUTORIZA", 1, 6, 0),
    BIT39_CODACC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODACC", 1, 2, 0),
    BIT41_IDENT_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDENT_TERM", 1, 8, 0),
    BIT42_CODFUC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CODFUC", 1, 15, 0),

    // BIT 43
    BIT43_NOMEDOESTABELECIMENTO(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "NOMEDOESTABELECIMENTO", 1, 22,
	    1),
    BIT43_NOMEDACIDADE(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "NOMEDACIDADE", 2, 13, 1),
    BIT43_CODIGODOPAISOUESTADO(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "CODIGODOPAISOUESTADO", 3, 3, 0),

    BIT45_LONG_DAPISTA1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAPISTA1", 1, 2, 0),
    BIT45_DAPISTA1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DAPISTA1", 2, 77, 0),

    BIT46_DADOS_ADI_RESP_LONG(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-RESP-LONG", 1, 3, 0),
    BIT46_DADOS_ADI_RESPOSTA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-RESPOSTA", 2, 999, 0),
    BIT46_DADOS_ADI_TLF(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-TLF", 3, 25, 0),
    BIT46_DADOS_ADI_TLF_FILLER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FILLER", 4, 974, 0),
    BIT46_DADOS_ADI_AVS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AVS", 5, 1, 0),
    BIT46_DADOS_ADI_CVE2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-CVE2", 6, 1, 0),
    BIT46_DADOS_ADI_FONT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-FONT", 7, 1, 0),
    BIT46_DADOS_ADI_FLOO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-FLOO", 8, 4, 0),
    BIT46_DADOS_ADI_ERRO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-ERRO", 9, 3, 0),
    BIT46_DADOS_ADI_ERRO2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS_ADI_ERRO2", 10, 3, 0),
    BIT46_DADOS_ADI_ACN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-ACN", 11, 3, 0),
    BIT46_DADOS_ADI_CVV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-CVV", 12, 1, 0),
    BIT46_DADOS_ADI_CRIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-CRIP", 13, 1, 0),
    BIT46_DADOS_ADI_TVR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-TVR", 14, 1, 0),
    BIT46_DADOS_ADI_CVR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-CVR", 15, 1, 0),
    BIT46_DADOS_ADI_NOME(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-NOME", 16, 1, 0),
    BIT46_DADOS_NUM_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-NUM-COB", 17, 1, 0),
    BIT46_DADOS_NOM_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-NOM-COB", 18, 1, 0),
    BIT46_DADOS_CID_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-CID-COB", 19, 1, 0),
    BIT46_DADOS_UF_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-UF-COB", 20, 1, 0),
    BIT46_DADOS_MAIL_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-MAIL-COB", 21, 1, 0),
    BIT46_DADOS_ADI_COB1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-MAIL-COB1", 22, 1, 0),
    BIT46_DADOS_ADI_COB2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-MAIL-COB2", 23, 1, 0),
    BIT46_DADOS_ADI_COB3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-MAIL-COB3", 24, 1, 0),
    BIT46_DADOS_PAD_COB(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-PAD-COB", 25, 1, 0),
    BIT46_COD_RESP_CAVV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-RESP-CAVV", 26, 1, 0),

    BIT47_DADOS_ADI_NACI_LONG(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-NACI-LONG", 1, 3, 0),
    BIT47_DADOS_ADI_NACIONAIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-NACIONAIS", 2, 999, 0),

    BIT48_LONG_DATPRIV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DATPRIV ", 1, 3, 0),
    BIT48_DATPRIV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DATPRIV ", 2, 999, 0),

    BIT49_COD_MON_TRANS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-MON-TRANS ", 1, 3, 0),

    BIT50_COD_MON_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-MON-LIQ ", 1, 3, 0),

    BIT51_COD_MON_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COD-MON-PORT", 1, 3, 0),

    BIT52_PINBLOCK(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "PINBLOCK", 1, 8, 0),

    BIT53_GES_SEGU_MSG(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-MSG", 1, 16, 0),
    BIT53_GES_SEGU_DET_POS1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS1", 2, 2, 0),
    BIT53_GES_SEGU_DET_POS2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS2", 3, 2, 0),
    BIT53_GES_SEGU_DET_POS3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS3", 4, 2, 0),
    BIT53_GES_SEGU_DET_POS4(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS4", 5, 2, 0),
    BIT53_GES_SEGU_DET_POS5(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS5", 6, 2, 0),
    BIT53_GES_SEGU_DET_POS6(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "GES-SEGU-DET-POS6", 7, 5, 0),

    BIT54_LONG_IMP_ADI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IMP-ADI", 1, 3, 0),
    BIT54_IMP_ADI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-ADI", 2, 120, 0),
    BIT54_IMP_ADI2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMP-ADI2", 3, 80, 0),
    BIT54_IMPADI_TIPCONTA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPADI-TIPCONTA", 4, 2, 0),
    BIT54_IMPADI_TIPVALOR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPADI-TIPVALOR", 5, 2, 0),
    BIT54_IMPADI_CODMOEDA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPADI-CODMOEDA", 6, 3, 0),
    BIT54_IMPADI_SIGNO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPADI-SIGNO", 7, 1, 0),
    BIT54_IMPADI_VALOR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IMPADI-VALOR", 8, 12, 0),
    BIT54_IMPADI_FILLER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FILLER", 9, 60, 0),

    BIT55_LONG_DAT_CHIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAT-CHIP", 1, 3, 0),
    BIT55_DATOS_TJT_CHIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DATOS-TJT-CHIP", 2, 999, 0),
    BIT55_DATOS_TJT_CHIP2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DATOS-TJT-CHIP2", 3, 255, 0),

    BIT56_LONG_DAD_CONSUM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAD-CONSUM", 1, 3, 0),
    BIT56_LONG_REL_CONSUM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAD-CONSUM", 2, 999, 0),

    BIT58_LONG_DAD_GEOGRA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAD-GEOGRA", 1, 3, 0),
    BIT58_DADOS_GEOGRAF(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-GEOGRAF", 2, 60, 0),
    BIT58_DADGEO_RUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADGEO-RUA", 3, 22, 0),
    BIT58_DADGEO_CEP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADGEO-CEP", 4, 9, 0),
    BIT58_DADGEO_PAIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADGEO-PAIS", 5, 3, 0),
    BIT58_DADGEO_NUMLOJA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADGEO-NUMLOJA", 6, 5, 0),
    BIT58_DADGEO_NOMSHOP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADGEO-NOMSHOP", 7, 21, 0),

    BIT59_LONG_DAD_TRANSP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAD-TRANSP", 1, 3, 0),
    BIT59_DADOS_TRANSPO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-TRANSPO", 2, 100, 0),

    BIT60_LONG_POS_INFORM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-POS-INFORM", 1, 3, 0),
    BIT60_TIPO_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TIPO-TERM", 2, 1, 0),
    BIT60_CAPACIDAD_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CAPACIDAD-TERM", 3, 1, 0),
    BIT60_COND_CHIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "COND-CHIP", 4, 1, 0),
    BIT60_ECOMMERCE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "ECOMMERCE", 5, 2, 0),
    BIT60_TIPO_TERM2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TIPO-TERM2", 6, 1, 0),
    BIT60_IND_APROV_PARC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-APROV-PARC", 7, 1, 0),
    BIT60_IND_LOCA_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-LOCA-TERM", 8, 1, 0),
    BIT60_IND_PRES_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-PRES-PORT", 9, 1, 0),
    BIT60_IND_PRES_CART(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-PRES-CART", 10, 1, 0),
    BIT60_IND_CAPT_CART(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-CAPT-CART", 11, 1, 0),
    BIT60_IND_STAT_TRAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-STAT-TRAN", 12, 1, 0),
    BIT60_IND_SEGU_TRAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-SEGU-TRAN", 13, 1, 0),
    BIT60_IND_RESERV1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-RESERV1", 14, 1, 0),
    BIT60_TIPO_POS_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TIPO-POS-TERM", 15, 1, 0),
    BIT60_CAPACI_TERM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CAPACI-TERM", 16, 1, 0),
    BIT60_IND_RESERV2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-RESERV2", 17, 2, 0),

    BIT62_LONG_DAD_ONLINE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DAD-ONLINE", 1, 3, 0),
    BIT62_DAD_ONLINE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DAD-ONLINE", 2, 999, 0),

    BIT63_LONG_DADOS_AVS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-AVS", 1, 3, 0),
    BIT63_AVS_S1_CODPOS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S1-CODPOS", 2, 9, 0),
    BIT63_AVS_S1_RUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S1-RUA", 3, 5, 0),
    BIT63_AVS_S1_NOME1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S1-NOME1", 4, 35, 0),
    BIT63_AVS_S1_SOBREN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S1-SOBREN", 5, 35, 0),
    BIT63_AVS_S2_NUMRUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-NUMRUA", 6, 15, 0),
    BIT63_AVS_S2_NOMRUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-NOMRUA", 7, 26, 0),
    BIT63_AVS_S2_CIDADE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-CIDADE", 8, 18, 0),
    BIT63_AVS_S2_ESTADO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-ESTADO", 9, 2, 0),
    BIT63_AVS_S2_EMAIL(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-EMAIL", 10, 64, 0),
    BIT63_AVS_S2_TELEF1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-TELEF1", 11, 15, 0),
    BIT63_AVS_S2_TELEF2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-TELEF2", 12, 15, 0),
    BIT63_AVS_S2_TELEF3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-TELEF3", 13, 15, 0),
    BIT63_AVS_S2_ENDERE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S2-ENDERE", 14, 1, 0),
    BIT63_AVS_S3_NOME1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-NOME1", 15, 35, 0),
    BIT63_AVS_S3_SOBREN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-SOBREN", 16, 35, 0),
    BIT63_AVS_S3_NUMRUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-NUMRUA", 17, 15, 0),
    BIT63_AVS_S3_NOMRUA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-NOMRUA", 18, 26, 0),
    BIT63_AVS_S3_CIDADE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-CIDADE", 19, 18, 0),
    BIT63_AVS_S3_ESTADO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-ESTADO", 20, 2, 0),
    BIT63_AVS_S3_CODPOS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-CODPOS", 21, 9, 0),
    BIT63_AVS_S3_PAIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-PAIS", 22, 3, 0),
    BIT63_AVS_S3_EMAIL(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-EMAIL", 23, 64, 0),
    BIT63_AVS_S3_TELEF1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-TELEF1", 24, 15, 0),
    BIT63_AVS_S3_TELEF2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-TELEF2", 25, 15, 0),
    BIT63_AVS_S3_TELEF3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-TELEF3", 26, 15, 0),
    BIT63_AVS_S3_INDIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-INDIP", 27, 1, 0),
    BIT63_AVS_S3_IPV6(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "AVS-S3-IPV6", 28, 39, 0),

    BIT70_CONTROL_DIALOGO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CONTROL-DIALOGO", 1, 3, 0),

    BIT90_IDTM_ORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDTM-ORI", 1, 4, 0),
    BIT90_NUMAUTORI_ORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUMAUTORI-ORI", 2, 6, 0),
    BIT90_NUMAUTORI_ORI2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUMAUTORI-ORI2", 3, 6, 0),
    BIT90_FHOTRANS_ORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "FHOTRANS-ORI", 4, 10, 0),
    BIT90_IDETRANS_ORI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS-ORI", 5, 6, 0),
    BIT90_IDETRANS_ORI2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS-ORI2", 6, 6, 0),
    BIT90_DADOS_ORIGINAL(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ORIGINAL", 7, 42, 0),
    BIT90_IDTM_ORI_N(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDTM-ORI-N", 8, 4, 0),
    BIT90_IDETRANS_ORI_N(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS-ORI-N", 9, 6, 0),
    BIT90_DHOTRANS_ORI_N(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS-ORI-N", 10, 10, 0),
    BIT90_NUMAUTO_ORI_N(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "NUMAUTO-ORI-N", 11, 6, 0),
    BIT90_FILLER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BIT90_FILLER", 12, 16, 0),
    BIT90_IDTM_ORI_I(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDTM-ORI-I", 13, 4, 0),
    BIT90_IDETRANS_ORI_I(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDETRANS-ORI-I", 14, 6, 0),
    BIT90_DHOTRANS_ORI_I(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DHOTRANS-ORI-I", 15, 10, 0),
    BIT90_BIT032_ORI_I(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BIT032-ORI-I", 16, 11, 0),
    BIT90_BIT033_ORI_I(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BIT033-ORI-I", 17, 11, 0),

    BIT95_VLR_REAL_TXN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VLR-REAL-TXN", 1, 12, 0),
    BIT95_VLR_REAL_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VLR-REAL-LIQ", 2, 12, 0),
    BIT95_IND_TAX_TXN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VLR-REAL-LIQ", 3, 1, 0),
    BIT95_VLR_REAL_TAX_TXN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VLR-REAL-TAX-TXN", 4, 8, 0),
    BIT95_IND_TAX_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-TAX-LIQ", 5, 1, 0),
    BIT95_VLR_REAL_TAX_LIQ(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VLR-REAL-TAX-LIQ", 6, 8, 0),

    BIT100_LONG_IDEN_INST_RECEP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IDEN-INST-RECEP", 1, 2, 0),
    BIT100_IDEN_INST_RECEP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IDEN-INST-RECEP", 2, 11, 0),

    BIT104_LONG_DADOS_SUBCREDEN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-SUBCREDEN", 1, 3, 0),
    BIT104_DADOS_SUBCREDEN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-SUBCREDEN", 2, 999, 0),
    BIT104_SUBCREDEN_ID(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "SUBCREDEN-ID", 3, 11, 0),
    BIT104_SUBCREDEN_NUM_ID(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "SUBCREDEN-NUM-ID", 4, 15, 0),
    BIT104_SUBCREDEN_NUM_ID2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "SUBCREDEN-NUM-ID2", 5, 15, 0),
    BIT104_SUBCREDEN_ID2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "SUBCREDEN-ID2", 6, 14, 0),

    BIT105_LONG_DADOS_ESPECIF2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-ESPECIF2", 1, 3, 0),
    BIT105_DADOS_ESPECIF2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ESPECIF2", 2, 999, 0),

    BIT106_LONG_DADOS_TRANSACI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-TRANSACI", 1, 3, 0),
    BIT106_DADOS_TRANSACI(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-TRANSACI", 2, 999, 0),

    BIT107_LONG_DADOS_TRNESP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-TRNESP", 1, 3, 0),
    BIT107_DADOS_TRNESP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-TRNESP", 2, 999, 0),
    BIT107_TRNESP_TIPPAG(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-TIPPAG", 3, 3, 0),
    BIT107_TRNESP_NUM_UNICO_REF(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-NUM-UNICO-REF", 4, 19, 0),
    BIT107_TRNESP_NOM_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-NOM-REM", 5, 40, 0),
    BIT107_TRNESP_DIR_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-DIR-REM", 6, 50, 0),
    BIT107_TRNESP_CID_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-CID-REM", 7, 25, 0),
    BIT107_TRNESP_COD_PAIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-COD-PAIS", 8, 3, 0),
    BIT107_TRNESP_CEP_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-CEP-PORT", 9, 15, 0),
    BIT107_TRNESP_ID_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-ID-PORT", 10, 38, 0),
    BIT107_TRNESP_ORI_FONDOS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-ORI-FONDOS", 11, 2, 0),
    BIT107_TRNESP_DATA_NACI_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-DATA-NACI-REM", 12, 8, 0),
    BIT107_TRNESP_NOM_DEST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-NOM-DEST", 13, 24, 0),
    BIT107_TRNESP_DAD_ADIC_TRANF(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-DAD-ADIC-TRANF", 14, 80,
	    0),
    BIT107_TRNESP_COD_DEST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-COD-DEST", 15, 24, 0),
    BIT107_TRNESP_EMAIL_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-EMAIL-REM", 16, 40, 0),
    BIT107_TRNESP_EMAIL_DEST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-EMAIL-DEST", 17, 40, 0),
    BIT107_TRNESP_TLF_REM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-TLF-REM", 18, 11, 0),
    BIT107_TRNESP_TLF_DEST(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-TLF-DEST", 19, 11, 0),
    BIT107_TRNESP_DEVICE_ID(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-DEVICE-ID", 20, 64, 0),
    BIT107_TRNESP_CPF_CNPJ_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-CPF-CNPJ-PORT", 21, 14, 0),
    BIT107_TRNESP_BIN_RETIRADA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "TRNESP-BIN-RETIRADA", 22, 8, 0),

    BIT121_BLOCO_2_PIN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BLOCO-2-PIN", 1, 8, 0),

    BIT122_LONG_DADOS_ADIAUTET(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-DADOS-ADIAUTET", 1, 3, 0),
    BIT122_DADOS_ADIAUTET(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADIAUTET", 2, 100, 0),
    BIT122_DADOS_ADI_AUT_TIP_AUT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-TIP-AUT", 3, 2, 0),
    BIT122_DADOS_ADI_AUT_RES_AUT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-RES-AUT", 4, 2, 0),
    BIT122_DADOS_ADI_AUT_SEG_FAT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-SEG-FAT", 5, 2, 0),
    BIT122_DADOS_ADI_AUT_IND_CHAV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-IND-CHAV", 6, 2,
	    0),
    BIT122_DADOS_ADI_AUT_VAL_CAVV(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-VAL-CAVV", 7, 4,
	    0),
    BIT122_DADOS_ADI_AUT_NUM_IMPR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-NUM-IMPR", 8, 4,
	    0),
    BIT122_DADOS_ADI_AUT_RAST_AUT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-RAST-AUT", 9, 16,
	    0),
    BIT122_DADOS_ADI_AUT_VER_ACAO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-VER-ACAO", 10, 1,
	    0),
    BIT122_DADOS_ADI_AUT_ACAO_AUT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-ACAO-AUT", 11, 1,
	    0),
    BIT122_DADOS_ADI_AUT_END_IP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-ADI-AUT-END-IP", 12, 8, 0),
    BIT122_FILLER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BIT122-FILLER", 13, 58, 0),

    BIT123_LONG_CAMPO_PROMOCIO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-CAMPO-PROMOCIO", 1, 3, 0),
    BIT123_CAMPO_PROMOCIO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CAMPO-PROMOCIO", 2, 999, 0),

    BIT124_LONG_QUAL_TRAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-QUAL-TRAN", 1, 3, 0),
    BIT124_QUAL_TRAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "QUAL-TRAN", 2, 124, 0),
    BIT124_B124_TRILHA1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-TRILHA1", 3, 1, 0),
    BIT124_B124_TRILHA2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-TRILHA2", 4, 1, 0),
    BIT124_B124_COND_DADOS_TRX(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-COND-DADOS-TRX", 5, 2, 0),
    BIT124_B124_PRODCAR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-PRODCAR", 6, 1, 0),
    BIT124_B124_INDPARCHIP(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-INDPARCHIP", 7, 1, 0),
    BIT124_B124_BIT55(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-BIT55", 8, 1, 0),
    BIT124_B124_HOSTCAPT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-HOSTCAPT", 9, 1, 0),
    BIT124_B124_SCORFRAU(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-SCORFRAU", 10, 3, 0),
    BIT124_B124_DADOSFRAU1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOSFRAU1", 11, 20, 0),
    BIT124_B124_DADOSFRAU2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOSFRAU2", 12, 20, 0),
    BIT124_B124_DADOSFRAU3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOSFRAU3", 13, 20, 0),
    BIT124_B124_DADOSFRAU4(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOSFRAU4", 14, 20, 0),
    BIT124_B124_SCO_FRAU_CREDEN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-SCO-FRAU-CREDEN", 15, 4, 0),
    BIT124_B124_SCO_FRAU_ELO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-SCO-FRAU-ELO", 16, 4, 0),
    BIT124_B124_MOT_PRI_SCO_FRA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-MOT-PRI-SCO-FRA", 17, 2, 0),
    BIT124_B124_MOT_SEC_SCO_FRA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-MOT-SEC-SCO-FRA", 18, 2, 0),
    BIT124_B124_MOT_TER_SCO_FRA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-MOT-TER-SCO-FRA", 19, 2, 0),
    BIT124_B124_REC_DECIS_FRAUD(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-REC-DECIS-FRAUD", 20, 1, 0),
    BIT124_B124_IND_ORI_SCORE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-IND-ORI-SCORE", 21, 1, 0),
    BIT124_B124_USO_FUTURO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-USO-FUTURO", 22, 67, 0),
    BIT124_B124_APROVJOGO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-APROVJOGO", 23, 1, 0),
    BIT124_B124_PRODCAR_CRED(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-PRODCAR-CRED", 24, 1, 0),
    BIT124_B124_DATA_COMPR(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DATA-COMPR", 25, 6, 0),
    BIT124_B124_NUM_VIOLA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-NUM-VIOLA", 26, 2, 0),
    BIT124_B124_DADOS_TRLH(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOS-TRLH", 27, 1, 0),
    BIT124_B124_DADOS_CVE(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOS-CVE", 28, 1, 0),
    BIT124_B124_DADOS_PAN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DADOS-PAN", 29, 1, 0),
    BIT124_B124_DATA_VENC(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-DATA-VENC", 30, 1, 0),
    BIT124_B124_NOM_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-NOM-PORT", 31, 1, 0),
    BIT124_B124_END_PORT(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-END-PORT", 32, 1, 0),
    BIT124_B124_PIN(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "B124-PIN", 33, 1, 0),
    BIT124_IND_COMP_DCA(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-DCA", 34, 3, 0),
    BIT124_IND_COMP_TR1(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-TR1", 35, 1, 0),
    BIT124_IND_COMP_PAIS(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-PAIS", 36, 3, 0),
    BIT124_IND_COMP_TR2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-TR2", 37, 1, 0),
    BIT124_IND_COMP_ANO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-ANO", 38, 4, 0),
    BIT124_IND_COMP_TR3(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-TR3", 39, 1, 0),
    BIT124_IND_COMP_CASO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "IND-COMP-CASO", 39, 5, 0),

    BIT125_LONG_USO_PERSONAL(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-USO-PERSONAL", 1, 3, 0),
    BIT125_DADOS_USO_PERSONAL(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-USO-PERSONAL", 2, 999, 0),

    BIT126_LONG_IDEN_CARTAOCVE2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IDEN-CARTAOCVE2", 1, 3, 0),
    BIT126_DADOS_IDEN_CARTCVE2(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-IDEN-CARTCVE2", 2, 999, 0),
    BIT126_CARTCVE2_INFO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-IDEN-CARTCVE2", 3, 1, 0),
    BIT126_CARTCVE2_DADO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "CARTCVE2-DADO", 4, 1, 0),

    BIT127_LONG_IDEN_VERSAO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "LONG-IDEN-VERSAO", 1, 1, 0),
    BIT127_DADOS_IDEN_VERSAO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "DADOS-IDEN-VERSAO", 2, 999, 0),
    BIT127_VERSAO_ISO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VERSAO-ISO", 3, 2, 0),
    BIT127_VERSAO_ANO(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VERSAO-ANO", 4, 2, 0),
    BIT127_VERSAO_NUM(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "VERSAO-NUM", 5, 1, 0),
    BIT127_FILLER(IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDaParte(), "BIT127-FILLER", 6, 994, 0);

	/**
	 * Representa a numeracao de ordem do campo.
	 * Ex: Campo 1, Campo 2... Campo 127.
	 */
	public int numeroDeOrdemDaParteDaMensagemCobol;
	public String nomeDoAtributo;
	/**
	 * Representa a numeracao de ordem do atributo dentro de um campo.
	 * Ex: No Campo 53, temos: Atributo 1= nomeDoEstabelecimento; Atributo 2= nomeDaCidade; Atributo 3= codigoDoPAisOuEstado;
	 */
	public int ordemDoAtributo;
	public int tamanhoDoAtributo;
	/**
	 * Informacoes podem ser distanciadas por trails, desta maneira
	 * cada atributo deve informar qual o espacamento entre ele e a proxima informação.
	 */
	public int tamanhoASerIgnoradoPosLeituraDoAtributo;
	
	public static List<DeParaCOBOLCopybookCampoElo> buscarAtributosPorNumeroDaParteDaMensagemCobol(ParteMensagemCOBOL parteDaMensagemCobol) {
	    return Arrays.stream(DeParaCOBOLCopybookCampoElo.values())
	            .filter(entrada -> entrada.numeroDeOrdemDaParteDaMensagemCobol == parteDaMensagemCobol.getNumeroDaParte())
	            .collect(Collectors.toList());
	}
	
}
