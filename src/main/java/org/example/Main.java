package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<JapanRugbyPlayer> japanRugbyPlayerList = List.of(new JapanRugbyPlayer("稲垣啓太", 186, 116, "PR"),
                new JapanRugbyPlayer("クレイグ・ミラー", 186, 116, "PR"), new JapanRugbyPlayer("シオネ・ハラシリ", 180, 120, "PR"),
                new JapanRugbyPlayer("堀江翔太", 180, 104, "HO"), new JapanRugbyPlayer("ワーナー・ディアンズ", 202, 117, "LO"),
                new JapanRugbyPlayer("ジャック・コーネルセン", 195, 110, "LO"), new JapanRugbyPlayer("姫野和樹", 187, 108, "No.8"),
                new JapanRugbyPlayer("リーチ・マイケル", 189, 113, "FL"), new JapanRugbyPlayer("ピーター・ラブスカフニ", 189, 106, "FL"),
                new JapanRugbyPlayer("齋藤直人", 165, 73, "SH"), new JapanRugbyPlayer("松田力也", 181, 92, "SO"), new JapanRugbyPlayer("ディラン・ライリー", 187, 102, "CTB"),
                new JapanRugbyPlayer("ジョネ・ナイカブラ", 177, 95, "WTB"), new JapanRugbyPlayer("レメキ・ロマノラヴァ", 178, 96, "WTB"),
                new JapanRugbyPlayer("セミシ・マシレワ", 184, 93, "WTB"), new JapanRugbyPlayer("松島幸太郎", 178, 87, "FB"));

        System.out.println("体重110㎏以上のポジション:選手名");
        for (JapanRugbyPlayer rugbyPlayer : japanRugbyPlayerList) {
            if (rugbyPlayer.getWeight() >= 110) {
                System.out.println(rugbyPlayer.getPosi() + " " + rugbyPlayer.getName());
            }
        }
        System.out.println("身長190cm以上のポジション：選手名");
        for (JapanRugbyPlayer rugbyPlayer : japanRugbyPlayerList) {
            if (rugbyPlayer.getHeight() >= 190) {
                System.out.println(rugbyPlayer.getPosi() + " " + rugbyPlayer.getName());
            }
        }
    }
}