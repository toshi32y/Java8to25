# Java8to25

Javaのブランクが長いので…、
Java 8からJava 25までの新機能を学習してみました。
サンプルコードは参考資料を参考にしています。

## 対象バージョン

- Java 5-8
- Java 9-11
- Java 14

## 学習内容

| Javaバージョン | 代表的な機能 | 意味・主な目的 |
|---|---|---|
| Java 8 | ラムダ式、Stream API、Optional、`java.time` | 関数型・宣言型プログラミングを導入 |
| Java 9 | モジュールシステム、`List.of`などのコレクションファクトリ、JShell | 大規模アプリの依存関係管理と開発体験を改善 |
| Java 10 | `var` | ローカル変数の型推論を導入 |
| Java 11 | String APIの拡張、標準HTTP Client | 文字列処理とHTTP通信を改善 |
| Java 12〜13 | switch式、Text Blocksのプレビュー | 構文を簡潔にする機能を試験導入 |
| Java 14 | switch式の正式化 | `switch`を値を返す式として利用可能に |
| Java 15 | Text Blocksの正式化、Sealed Classesのプレビュー | 複数行文字列を扱いやすくし、継承を制限する機能を導入 |
| Java 16 | Record、`instanceof`のパターンマッチング | データ保持クラスや型判定の定型コードを削減 |
| Java 17 | Sealed Classesの正式化 | クラスやインターフェースの継承先を制限 |
| Java 18 | UTF-8の標準化、簡易Webサーバー | 文字コードの一貫性と開発環境を改善 |
| Java 19〜20 | Virtual Threadsなどのプレビュー | 軽量な並行処理の仕組みを試験導入 |
| Java 21 | Virtual Threads、Record Patterns、`switch`のパターンマッチング | 並行処理とパターンマッチングを強化 |
| Java 22 | Foreign Function and Memory API、Unnamed Variables | ネイティブ連携と未使用変数の扱いを改善 |
| Java 23 | パターン・モジュール・コンストラクターの拡張 | 後続バージョンに向けた機能をプレビュー導入 |
| Java 24 | Stream Gatherers、AOT関連の改善 | Streamの拡張性と起動・ウォームアップ性能を改善 |
| Java 25 | Compact Source Files、Instance Main Methods、Module Import Declarations、JVM性能改善 | 入門用の記述を簡潔にし、最新機能と性能改善を集約 |

- ラムダ式
- Stream API
- Optional
- var
- モジュールシステム
- switch式
- テキストブロック
- Records
- Pattern Matching
- Sealed Classes
- Virtual Threads
- そのほかのJava新機能

## 実行環境

- JDK 25 (Temurin-25.0.4.1+1)
- IntelliJ IDEA
- Git
