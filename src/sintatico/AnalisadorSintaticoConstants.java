/* Generated By:JavaCC: Do not edit this line. AnalisadorSintaticoConstants.java */
package sintatico;
/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface AnalisadorSintaticoConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int CARACTER = 1;
  /** RegularExpression Id. */
  int INTEIRO = 2;
  /** RegularExpression Id. */
  int REAL = 3;
  /** RegularExpression Id. */
  int VAZIO = 4;
  /** RegularExpression Id. */
  int FAZER = 5;
  /** RegularExpression Id. */
  int PARA = 6;
  /** RegularExpression Id. */
  int SE = 7;
  /** RegularExpression Id. */
  int SENAO = 8;
  /** RegularExpression Id. */
  int RETORNO = 9;
  /** RegularExpression Id. */
  int PADRAO = 10;
  /** RegularExpression Id. */
  int QUEBRAR = 11;
  /** RegularExpression Id. */
  int CASO = 12;
  /** RegularExpression Id. */
  int ESCOLHA = 13;
  /** RegularExpression Id. */
  int ENQUANTO = 14;
  /** RegularExpression Id. */
  int VERDADEIRO = 15;
  /** RegularExpression Id. */
  int FALSO = 16;
  /** RegularExpression Id. */
  int DIGITO = 17;
  /** RegularExpression Id. */
  int NUMEROINTEIRO = 18;
  /** RegularExpression Id. */
  int NUMEROREAL = 19;
  /** RegularExpression Id. */
  int LEXEMA_NEGAR = 20;
  /** RegularExpression Id. */
  int IDENTIFICADOR = 21;
  /** RegularExpression Id. */
  int ECHAVE = 22;
  /** RegularExpression Id. */
  int DCHAVE = 23;
  /** RegularExpression Id. */
  int EPARENTESE = 24;
  /** RegularExpression Id. */
  int DPARENTESE = 25;
  /** RegularExpression Id. */
  int PONTOVIRGULA = 26;
  /** RegularExpression Id. */
  int DOISPONTOS = 27;
  /** RegularExpression Id. */
  int VIRGULA = 28;
  /** RegularExpression Id. */
  int IGUAL = 29;
  /** RegularExpression Id. */
  int OULOGICO = 30;
  /** RegularExpression Id. */
  int ELOGICO = 31;
  /** RegularExpression Id. */
  int IGUALIGUAL = 32;
  /** RegularExpression Id. */
  int DIFERENTE = 33;
  /** RegularExpression Id. */
  int MENOR = 34;
  /** RegularExpression Id. */
  int MAIOR = 35;
  /** RegularExpression Id. */
  int MENORIGUAL = 36;
  /** RegularExpression Id. */
  int MAIORIGUAL = 37;
  /** RegularExpression Id. */
  int MAIS = 38;
  /** RegularExpression Id. */
  int MENOS = 39;
  /** RegularExpression Id. */
  int MULTIPLICACAO = 40;
  /** RegularExpression Id. */
  int DIVISAO = 41;
  /** RegularExpression Id. */
  int INCREMENTA = 42;
  /** RegularExpression Id. */
  int DECREMENTA = 43;
  /** RegularExpression Id. */
  int MENORMENOR = 44;
  /** RegularExpression Id. */
  int MAIORMAIOR = 45;
  /** RegularExpression Id. */
  int ASPAS = 46;
  /** RegularExpression Id. */
  int LEXEMAS_INVALIDOS = 57;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int COMENTARIO_LINHA = 1;
  /** Lexical state. */
  int COMENTARIO_BLOCO = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"char\"",
    "\"int\"",
    "\"float\"",
    "\"void\"",
    "\"do\"",
    "\"for\"",
    "\"if\"",
    "\"else\"",
    "\"back\"",
    "\"default\"",
    "\"break\"",
    "\"case\"",
    "\"switch\"",
    "\"while\"",
    "\"true\"",
    "\"false\"",
    "<DIGITO>",
    "<NUMEROINTEIRO>",
    "<NUMEROREAL>",
    "<LEXEMA_NEGAR>",
    "<IDENTIFICADOR>",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\";\"",
    "\":\"",
    "\",\"",
    "\"=\"",
    "\"||\"",
    "\"&&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"++\"",
    "\"--\"",
    "\"<<\"",
    "\">>\"",
    "\"\\\"\"",
    "\" \"",
    "\"#\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"//\"",
    "\"/*\"",
    "\"//\"",
    "\"*/\"",
    "<token of kind 56>",
    "<LEXEMAS_INVALIDOS>",
  };

}
