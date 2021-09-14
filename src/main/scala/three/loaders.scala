package typings.three.three.loaders

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*

@js.native
@JSGlobal("THREE.FileLoader")
class FileLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  val mimeType: js.UndefOr[MimeType] = js.native;
  val responseType: js.UndefOr[String] = js.native;
  def load(
      url: String,
      onLoad: js.UndefOr[js.Function1[String | ArrayBuffer, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): js.Any = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[String | ArrayBuffer] = js.native
  def setMimeType(mimeType: MimeType): FileLoader = js.native
  def setResponseType(responseType: String): FileLoader = js.native

@js.native
@JSGlobal("THREE.TextureLoader")
class TextureLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.UndefOr[js.Function1[Texture, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): Texture = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[Texture] = js.native

@js.native
@JSGlobal("THREE.CompressedTextureLoader")
class CompressedTextureLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.Function1[CompressedTexture, Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): CompressedTexture = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[CompressedTexture] = js.native

@js.native
@JSGlobal("THREE.FontLoader")
class FontLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.UndefOr[js.Function1[Font, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[Font] = js.native
  def parse(json: js.Any): Font = js.native

@js.native
@JSGlobal("THREE.ObjectLoader")
class ObjectLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load[ObjectType](
      url: String,
      onLoad: js.UndefOr[js.Function1[ObjectType, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[Error | ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync[ObjectType <: Object3D](
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[ObjectType] = js.native
  def parse[T <: Object3D](json: js.Any, onLoad: js.UndefOr[js.Function1[Object3D, Unit]]): T = js.native
  def parseAsync[T <: Object3D](json: js.Any): js.Promise[T] = js.native
  def parseGeometries(json: js.Any): objectType11 = js.native
  def parseMaterials(json: js.Any, textures: js.Array[Texture]): js.Array[Material] = js.native
  def parseAnimations(json: js.Any): js.Array[AnimationClip] = js.native
  def parseImages(json: js.Any, onLoad: js.Function0[Unit]): objectType12 = js.native
  def parseImagesAsync(json: js.Any): js.Promise[objectType12] = js.native
  def parseTextures(json: js.Any, images: js.Any): js.Array[Texture] = js.native
  def parseObject[T <: Object3D](
      data: js.Any,
      geometries: js.Array[js.Any],
      materials: js.Array[Material],
      animations: js.Array[AnimationClip]
  ): T = js.native
val DefaultLoadingManager: LoadingManager = js.native;

@js.native
@JSGlobal("THREE.LoadingManager")
class LoadingManager extends js.Object:
  def this(
      onLoad: js.UndefOr[js.Function0[Unit]],
      onProgress: js.UndefOr[js.Function3[String, Double, Double, Unit]],
      onError: js.UndefOr[js.Function1[String, Unit]]
  ) = this()
  val onStart: js.UndefOr[js.Function3[String, Double, Double, Unit]] = js.native;
  val onLoad: js.Function0[Unit] = js.native;
  val onProgress: js.Function3[String, Double, Double, Unit] = js.native;
  val onError: js.Function1[String, Unit] = js.native;
  def setURLModifier(callback: js.UndefOr[js.Function1[String, String]]): this.type = js.native
  def resolveURL(url: String): String = js.native
  def itemStart(url: String): Unit = js.native
  def itemEnd(url: String): Unit = js.native
  def itemError(url: String): Unit = js.native
  def addHandler(regex: js.RegExp, loader: Loader): this.type = js.native
  def removeHandler(regex: js.RegExp): this.type = js.native
  def getHandler(file: String): Loader | Null = js.native

@js.native
@JSGlobal("THREE.ImageLoader")
class ImageLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.UndefOr[js.Function1[HTMLImageElement, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): HTMLImageElement = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[HTMLImageElement] = js.native

@js.native
@JSGlobal("THREE.AudioLoader")
class AudioLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.Function1[AudioBuffer, Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[AudioBuffer] = js.native

@js.native
@JSGlobal("THREE.MaterialLoader")
class MaterialLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  val textures: objectType13 = js.native;
  def load(
      url: String,
      onLoad: js.Function1[Material, Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[Error | ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[Material] = js.native
  def setTextures(textures: objectType13): this.type = js.native
  def parse(json: js.Any): Material = js.native

@js.native
sealed trait LoaderUtils extends js.Object:
  def decodeText(array: BufferSource): String = js.native
  def extractUrlBase(url: String): String = js.native
val LoaderUtils: LoaderUtils = js.native;

@js.native
@JSGlobal("THREE.BufferGeometryLoader")
class BufferGeometryLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.Function1[InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[InstancedBufferGeometry | BufferGeometry] = js.native
  def parse(json: js.Any): InstancedBufferGeometry | BufferGeometry = js.native

@js.native
@JSGlobal("THREE.AnimationLoader")
class AnimationLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.Function1[js.Array[AnimationClip], Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): Unit = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[js.Array[AnimationClip]] = js.native
  def parse(json: js.Any): js.Array[AnimationClip] = js.native

@js.native
@JSGlobal("THREE.CubeTextureLoader")
class CubeTextureLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      urls: js.Array[String],
      onLoad: js.UndefOr[js.Function1[CubeTexture, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): CubeTexture = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[CubeTexture] = js.native

@js.native
@JSGlobal("THREE.DataTextureLoader")
class DataTextureLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  def load(
      url: String,
      onLoad: js.Function2[DataTexture, js.Object, Unit],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): DataTexture = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[DataTexture] = js.native

@js.native
@JSGlobal("THREE.Cache")
object Cache extends js.Object:
  val enabled: Boolean = js.native;
  val files: js.Any = js.native;
  def add(key: String, file: js.Any): Unit = js.native
  def get(key: String): js.Any = js.native
  def remove(key: String): Unit = js.native
  def clear(): Unit = js.native

@js.native
@JSGlobal("THREE.ImageBitmapLoader")
class ImageBitmapLoader extends Loader:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  val options: js.UndefOr[js.Object] = js.native;
  var isImageBitmapLoader: Boolean = js.native;
  def setOptions(options: js.Object): ImageBitmapLoader = js.native
  def load(
      url: String,
      onLoad: js.UndefOr[js.Function1[ImageBitmap, Unit]],
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]],
      onError: js.UndefOr[js.Function1[ErrorEvent, Unit]]
  ): js.Any = js.native
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[ImageBitmap] = js.native

@js.native
@JSGlobal("THREE.Loader")
class Loader extends js.Object:
  def this(manager: js.UndefOr[LoadingManager]) = this()
  val crossOrigin: String = js.native;
  val withCredentials: Boolean = js.native;
  val path: String = js.native;
  val resourcePath: String = js.native;
  val manager: LoadingManager = js.native;
  val requestHeader: objectType14 = js.native;
  def loadAsync(
      url: String,
      onProgress: js.UndefOr[js.Function1[ProgressEvent, Unit]]
  ): js.Promise[js.Any] = js.native
  def setCrossOrigin(crossOrigin: String): this.type = js.native
  def setWithCredentials(value: Boolean): this.type = js.native
  def setPath(path: String): this.type = js.native
  def setResourcePath(resourcePath: String): this.type = js.native
  def setRequestHeader(requestHeader: objectType14): this.type = js.native

@js.native
sealed trait objectType12 extends js.Object:
  @JSBracketAccess
  def apply(key: String): HTMLImageElement = js.native

@js.native
sealed trait objectType11 extends js.Object:
  @JSBracketAccess
  def apply(key: String): InstancedBufferGeometry | BufferGeometry = js.native

@js.native
sealed trait objectType14 extends js.Object:
  @JSBracketAccess
  def apply(header: String): String = js.native

@js.native
sealed trait objectType13 extends js.Object:
  @JSBracketAccess
  def apply(key: String): Texture = js.native
