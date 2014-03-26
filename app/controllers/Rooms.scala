package controllers

//import play.api._
import play.api.mvc._

//import models._
/**
 * Rooms オブジェクト
 *
 */
object Rooms extends Controller {

  /**
   * index
   *
   * @return 自分のチャット一覧の取得
   */
  def index = TODO

  /**
   * add
   *
   * @return グループチャットを新規作成
   */
  def add = TODO

  /**
   * add
   *
   * @param roomId チャットルーム ID
   * @return チャットの名前、アイコン、種類(my/direct/group)を取得
   */
  def get(roomId: Long) = TODO

  /**
   * update
   *
   * @param roomId チャットルーム ID
   * @return チャットの名前、アイコンをアップデート
   */
  def update(roomId: Long) = TODO

  /**
   * delete
   *
   * @param roomId チャットルーム ID
   * @return グループチャットを退席/削除する
   */
  def delete(roomId: Long) = TODO

  /**
   * getMembers
   *
   * @param roomId チャットルーム ID
   * @return チャットのメンバー一覧を取得
   */
  def getMembers(roomId: Long) = TODO

  /**
   * updateMembers
   *
   * @param roomId チャットルーム ID
   * @return チャットのメンバーを一括変更
   */
  def updateMembers(roomId: Long) = TODO

  /**
   * getMessages
   *
   * @param roomId チャットルーム ID
   * @return ※このAPIは未実装です！まだ利用することはできません
   * チャットのメッセージ一覧を取得 (※100件まで取得可能。今後、より多くのデータを取得する為のページネーションの仕組みを提供予定)
   */
  def getMessages(roomId: Long) = TODO

  /**
   * postMessages
   *
   * @param roomId チャットルーム ID
   * @return チャットに新しいメッセージを追加
   */
  def postMessages(roomId: Long) = TODO

  /**
   * getMessage
   *
   * @param roomId チャットルーム ID
   * @param messageId メッセージ ID
   * @return メッセージ情報を取得
   */
  def getMessage(roomId: Long, messageId: Long) = TODO

  /**
   * getTasks
   *
   * @param roomId チャットルーム ID
   * @return チャットのタスク一覧を取得 (※100件まで取得可能。今後、より多くのデータを取得する為のページネーションの仕組みを提供予定)
   */
  def getTasks(roomId: Long) = TODO

  /**
   * postTasks
   *
   * @param roomId チャットルーム ID
   * @return チャットに新しいタスクを追加
   */
  def postTasks(roomId: Long) = TODO

  /**
   * getTask
   *
   * @param roomId チャットルーム ID
   * @param taskId タスク ID
   * @return タスク情報を取得
   */
  def getTask(roomId: Long, taskId: Long) = TODO

  /**
   * getFiles
   *
   * @param roomId チャットルーム ID
   * @return チャットのファイル一覧を取得 (※100件まで取得可能。今後、より多くのデータを取得する為のページネーションの仕組みを提供予定)
   */
  def getFiles(roomId: Long) = TODO

  /**
   * getFiles
   *
   * @param roomId チャットルーム ID
   * @param fileId ファイル ID
   * @return ファイル情報を取得
   */
  def getFile(roomId: Long, fileId: Long) = TODO
}