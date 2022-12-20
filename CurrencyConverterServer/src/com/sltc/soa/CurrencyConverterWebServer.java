package com.sltc.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CurrencyConverterWebServer {
    Map<String, Double> rates = new HashMap<String, Double>() {
        {
            put("AED", 3.6732);
            put("AFN", 77.050008);
            put("ALL", 103.68506);
            put("AMD", 481.616228);
            put("ANG", 1.795336);
            put("AOA", 654.817);
            put("ARS", 81.308621);
            put("AUD", 1.35885);
            put("AWG", 1.8);
            put("AZN", 1.7025);
            put("BAM", 1.63183);
            put("BBD", 2.0);
            put("BDT", 84.820901);
            put("BGN", 1.638754);
            put("BHD", 0.377047);
            put("BIF", 1942.067684);
            put("BMD", 1.0);
            put("BND", 1.337283);
            put("BOB", 6.896333);
            put("BRL", 5.3326);
            put("BSD", 1.0);
            put("BTC", 0.000050883602);
            put("BTN", 73.955366);
            put("BWP", 11.045764);
            put("BYN", 2.590297);
            put("BZD", 2.016103);
            put("CAD", 1.299149);
            put("CDF", 1967.998483);
            put("CHF", 0.908343);
            put("CLF", 0.027612);
            put("CLP", 761.901298);
            put("CNH", 6.579093);
            put("CNY", 6.5789);
            put("COP", 3622.097235);
            put("CRC", 603.954355);
            put("CUC", 1.000209);
            put("CUP", 25.75);
            put("CVE", 92.25);
            put("CZK", 22.0117);
            put("DJF", 178.04543);
            put("DKK", 6.235367);
            put("DOP", 58.126556);
            put("DZD", 129.204088);
            put("EGP", 15.6547);
            put("ERN", 14.999872);
            put("ETB", 38.159345);
            put("EUR", 0.8377);
            put("FJD", 2.07515);
            put("FKP", 0.749906);
            put("GBP", 0.749906);
            put("GEL", 3.335);
            put("GGP", 0.749906);
            put("GHS", 5.861083);
            put("GIP", 0.749906);
            put("GMD", 51.8);
            put("GNF", 9835.268744);
            put("GTQ", 7.818948);
            put("GYD", 209.569954);
            put("HKD", 7.75142);
            put("HNL", 24.261522);
            put("HRK", 6.3283);
            put("HTG", 66.179967);
            put("HUF", 300.77);
            put("IDR", 14105.403438);
            put("ILS", 3.305165);
            put("IMP", 0.749906);
            put("INR", 74.000545);
            put("IQD", 1192.820675);
            put("IRR", 42105.00);
            put("ISK", 133.03);
            put("JEP", 0.749906);
            put("JMD", 146.642194);
            put("JOD", 0.709);
            put("JPY", 104.307);
            put("KES", 110.1);
            put("KGS", 84.7986);
            put("KHR", 4061.970289);
            put("KMF", 412.250037);
            put("KPW", 900.0);
            put("KRW", 1110.01);
            put("KWD", 0.305399);
            put("KYD", 0.833507);
            put("KZT", 425.772953);
            put("LAK", 9275.558309);
            put("LBP", 1515.335981);
            put("LKR", 185.834886);
            put("LRD", 157.499967);
            put("LSL", 15.389181);
            put("LYD", 1.355);
            put("MAD", 9.083784);
            put("MDL", 17.195519);
            put("MGA", 3783.43811);
            put("MKD", 51.645807);
            put("MMK", 1315.248254);
            put("MNT", 2854.831181);
            put("MOP", 7.985649);
            put("MRO", 3570.00);
            put("MRU", 37.16);
            put("MUR", 39.849215);
            put("MVR", 15.41);
            put("MWK", 763.604016);
            put("MXN", 20.163212);
            put("MYR", 4.074);
            put("MZN", 74.231998);
            put("NAD", 15.43);
            put("NGN", 383.278728);
            put("NIO", 34.853771);
            put("NOK", 8.8847);
            put("NPR", 118.328789);
            put("NZD", 1.424685);
            put("OMR", 0.38501);
            put("PAB", 1.0);
            put("PEN", 3.60376);
            put("PGK", 3.520701);
            put("PHP", 48.109536);
            put("PKR", 159.457928);
            put("PLN", 3.75234);
            put("PYG", 7050.860811);
            put("QAR", 3.64075);
            put("RON", 4.0835);
            put("RSD", 98.49);
            put("RUB", 76.44);
            put("RWF", 988.881865);
            put("SAR", 3.750733);
            put("SBD", 8.066615);
            put("SCR", 20.810052);
            put("SDG", 55.325);
            put("SEK", 8.5735);
            put("SGD", 1.33976);
            put("SHP", 0.749906);
            put("SLL", 10131.136388);
            put("SOS", 580.369719);
            put("SRD", 14.154);
            put("SSP", 130.26);
            put("STD", 20900.544238);
            put("STN", 20.67);
            put("SVC", 8.752242);
            put("SYP", 512.847186);
            put("SZL", 15.281883);
            put("THB", 30.27);
            put("TJS", 11.329606);
            put("TMT", 3.51);
            put("TND", 2.734);
            put("TOP", 2.287117);
            put("TRY", 7.8277);
            put("TTD", 6.794794);
            put("TWD", 28.533199);
            put("TZS", 2319.433675);
            put("UAH", 28.500356);
            put("UGX", 3703.733059);
            put("USD", 1.0);
            put("UYU", 42.640694);
            put("UZS", 10389.69954);
            put("VEF", 248487.642241);
            put("VES", 915980.365);
            put("VND", 23239.023071);
            put("VUV", 111.887732);
            put("WST", 2.571605);
            put("XAF", 549.495179);
            put("XAG", 0.04412479);
            put("XAU", 0.00056218);
            put("XCD", 2.70255);
            put("XDR", 0.70051);
            put("XOF", 549.495179);
            put("XPD", 0.00042075);
            put("XPF", 99.9642);
            put("XPT", 0.00102984);
            put("YER", 250.349961);
            put("ZAR", 15.441171);
            put("ZMW", 21.003963);
            put("ZWL", 322.0);
        }
    };
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @WebMethod
    public String currencyConverterSourceUsd(String amount, String targetCurrency) {
        double result = (Double.parseDouble(amount) * rates.get(targetCurrency));
//        System.out.println("The converted amount is " + targetCurrency +" " + result);
        System.out.println("The converted amount is " + targetCurrency +" " + df.format(result));

        return df.format(result);
    }

    @WebMethod
    public String currencyConverterTargetUsd(String amount, String sourceCurrency) {
        double result = (Double.parseDouble(amount) / rates.get(sourceCurrency));
//        System.out.println("The converted amount is " + "USD" + " " + result);
        System.out.println("The converted amount is " + "USD" +" " + df.format(result));
        return df.format(result);
    }

    @WebMethod
    public String currencyConverterWithOutUsd(String amount, String sourceCurrency, String targetCurrency) {
        String amountInUSD = currencyConverterTargetUsd(amount,  sourceCurrency);
        double amountInTargetCurrency = Double.parseDouble(currencyConverterSourceUsd(amountInUSD,  targetCurrency));
        System.out.println("The converted amount is "+ targetCurrency +" "  + df.format(amountInTargetCurrency));
        return df.format(amountInTargetCurrency);
    }


    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/DemoWebService", new CurrencyConverterWebServer());
    }
}

