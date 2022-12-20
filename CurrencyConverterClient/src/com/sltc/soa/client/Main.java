package com.sltc.soa.client;

import com.sltc.soa.client.stub.CurrencyConverterWebServer;
import com.sltc.soa.client.stub.CurrencyConverterWebServerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

//    private static String[] currencyCodes = new String[]{"USD", "AUD","TTD","WST","PAB"};
    private static  String[]currencyCodes = new String[]{"ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC",
        "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNH", "CNY", "COP", "CRC", "CUC",
        "CUP",
        "CVE",
        "CZK",
        "DJF",
        "DKK",
        "DOP",
        "DZD",
        "EGP",
        "ERN",
        "ETB",
        "EUR",
        "FJD",
        "FKP",
        "GBP",
        "GEL",
        "GGP",
        "GHS",
        "GIP",
        "GMD",
        "GNF",
        "GTQ",
        "GYD",
        "HKD",
        "HNL",
        "HRK",
        "HTG",
        "HUF",
        "IDR",
        "ILS",
        "IMP",
        "INR",
        "IQD",
        "IRR",
        "ISK",
        "JEP",
        "JMD",
        "JOD",
        "JPY",
        "KES",
        "KGS",
        "KHR",
        "KMF",
        "KPW",
        "KRW",
        "KWD",
        "KYD",
        "KZT",
        "LAK",
        "LBP",
        "LKR",
        "LRD",
        "LSL",
        "LYD",
        "MAD",
        "MDL",
        "MGA",
        "MKD",
        "MMK",
        "MNT",
        "MOP",
        "MRO",
        "MRU",
        "MUR",
        "MVR",
        "MWK",
        "MXN",
        "MYR",
        "MZN",
        "NAD",
        "NGN",
        "NIO",
        "NOK",
        "NPR",
        "NZD",
        "OMR",
        "PAB",
        "PEN",
        "PGK",
        "PHP",
        "PKR",
        "PLN",
        "PYG",
        "QAR",
        "RON",
        "RSD",
        "RUB",
        "RWF",
        "SAR",
        "SBD",
        "SCR",
        "SDG",
        "SEK",
        "SGD",
        "SHP",
        "SLL",
        "SOS",
        "SRD",
        "SSP",
        "STD",
        "STN",
        "SVC",
        "SYP",
        "SZL",
        "THB",
        "TJS",
        "TMT",
        "TND",
        "TOP",
        "TRY",
        "TTD",
        "TWD",
        "TZS",
        "UAH",
        "UGX",
        "USD",
        "UYU",
        "UZS",
        "VEF",
        "VES",
        "VND",
        "VUV",
        "WST",
        "XAF",
        "XAG",
        "XAU",
        "XCD",
        "XDR",
        "XOF",
        "XPD",
        "XPF",
        "XPT",
        "YER",
        "ZAR",
        "ZMW",
        "ZWL"
    };


    public static void main(String[] args) {
//         URL url = new URL("http://demowebservice.com:8080/currencyservice?wsdl");
//        DemoWSService demoWSService = new DemoWSService(url);

        CurrencyConverterWebServerService currencyConverterService = new CurrencyConverterWebServerService();
        CurrencyConverterWebServer currencyConverterPort = currencyConverterService.getCurrencyConverterWebServerPort();

        getConverterUI(currencyConverterPort);
    }

    public static void getConverterUI(CurrencyConverterWebServer currencyConverterPort) {

        JFrame frame = new JFrame("Currency Converter");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 400);
        frame.setSize(500, 230);
        frame.setLocation(430, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        JLabel sourceCurrencyLabel = new JLabel("Select Source Currency");
        sourceCurrencyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(sourceCurrencyLabel);

        final JComboBox<String> sourceCurrencyDropdown = new JComboBox<String>(currencyCodes);
        sourceCurrencyDropdown.setSize(100, 20);
        sourceCurrencyDropdown.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(sourceCurrencyDropdown);

        JLabel targetCurrencyLabel = new JLabel("Select Target Currency");
        targetCurrencyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(targetCurrencyLabel);

        final JComboBox<String> targetCurrencyDropdown = new JComboBox<String>(currencyCodes);
        targetCurrencyDropdown.setSize(100, 20);
        targetCurrencyDropdown.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(targetCurrencyDropdown);

        JLabel amountLabel = new JLabel("Input Amount");
        amountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(amountLabel);

        JTextField amountTextField = new JTextField();
        amountTextField.setSize(100, 20 );
        amountTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(amountTextField);

        JLabel outputLabel = new JLabel();
        outputLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(outputLabel);

        JButton convertButton = new JButton("Convert");
        convertButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String amount = amountTextField.getText();
                String sourceCurrency = (String) sourceCurrencyDropdown.getSelectedItem();
                String targetCurrency = (String) targetCurrencyDropdown.getSelectedItem();

                if (amount == null || amount.isEmpty()) {
                    outputLabel.setText("Please input the amount !");
                    return;
                }

                if (sourceCurrency == null || sourceCurrency.isEmpty()) {
                    outputLabel.setText("Please select the source currency !");
                    return;
                }

                if (targetCurrency == null || targetCurrency.isEmpty()) {
                    outputLabel.setText("Please select the target currency !");
                    return;
                }

                if (sourceCurrency.equalsIgnoreCase(targetCurrency)) {
                    outputLabel.setText("Source and Target currencies can't be the same !");
                    return;
                }

                String result = "";
                if (sourceCurrency.equalsIgnoreCase("USD")) {
                    result = currencyConverterPort.currencyConverterSourceUsd(amount, targetCurrency);
                } else if (targetCurrency.equalsIgnoreCase("USD")) {
                    result = currencyConverterPort.currencyConverterTargetUsd(amount, sourceCurrency);
                } else {
                    result = currencyConverterPort.currencyConverterWithOutUsd(amount, sourceCurrency, targetCurrency);
                }

                outputLabel.setText("The converted amount is " + targetCurrency + " " + result);
            }
        });
        panel.add(convertButton);

        frame.setVisible(true);
    }

}
