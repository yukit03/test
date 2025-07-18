package print13.questions08;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		//テキストブロックの形
		//		String text = """
		//				昔々、ある所にお爺さんとお婆さんがいました。
		//				お爺さんは山へ芝刈りにお婆さんは川へ洗濯に行きました。
		//				お婆さんが川で洗濯をしていると大きな桃が流れてきました。
		//				""";

		//1
		String text = "昔々、ある所にお爺さんとお婆さんがいました。" +
				"お爺さんは山へ芝刈りにお婆さんは川へ洗濯に行きました。" +
				"お婆さんが川で洗濯をしていると大きな桃が流れてきました。";

		//2 助詞の正規表現パターン
		String particlePattern = "に|へ|と|が|は|で|を|。|、";

		// 文章を助詞で分割する正規表現パターン
		String[] words = text.replaceAll("\\s+", "").split(particlePattern);


		//3
		Map<String, Integer> wordCountMap = new HashMap<>();
		//4 単語の出現回数をカウントする
		int count = 0;
		//5
		for (String word : words) {	//文章を分割して配列の各要素に単語が入っている
			if(wordCountMap.containsKey(word)) {//マップに単語がある時
				int val = wordCountMap.get(word) + 1;	//現在のmapにある値を取得して1加算する
				wordCountMap.put(word, val);			//値を更新するため上書きする
				if(count < val) {						//出現回数のカウンターが更新される場合
					count = val;
				}
			}else {										//新規単語の場合
				wordCountMap.put(word, 1);
			}
		}

		// 結果を出力する
		System.out.println("頻出単語のカウント(降順):");
		//6
		for(int i = count;i>0;i--) {	//多い順に表示するので、カウンターの数から数えてループ変数を減らしていく
			for(String key : wordCountMap.keySet()) {	//mapのループはkeysetを使う
				int val = wordCountMap.get(key);		//keyに対する値を取得
				if(val == i) {							//頻出カウンターと同じ値の場合
					System.out.println(key + ": " + wordCountMap.get(key));	//表示
				}
			}
		}
	}
}
