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
	var mimeType: js.UndefOr[MimeType] = js.native;
	var responseType: js.UndefOr[String] = js.native;
	def load(url: String, onLoad: js.UndefOr[js.Function1[String | ArrayBuffer,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): js.Any = js.native

	def setMimeType(mimeType: MimeType): FileLoader = js.native
	def setResponseType(responseType: String): FileLoader = js.native

@js.native
@JSGlobal("THREE.TextureLoader")
class TextureLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.UndefOr[js.Function1[Texture,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): Texture = js.native


@js.native
@JSGlobal("THREE.CompressedTextureLoader")
class CompressedTextureLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.Function1[CompressedTexture,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): CompressedTexture = js.native


@js.native
@JSGlobal("THREE.FontLoader")
class FontLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.UndefOr[js.Function1[Font,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): Unit = js.native

	def parse(json: js.Any): Font = js.native

@js.native
@JSGlobal("THREE.ObjectLoader")
class ObjectLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load[ObjectType](url: String, onLoad: js.UndefOr[js.Function1[ObjectType,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[Error | ErrorEvent,Unit]]): Unit = js.native

	def parse[T <: Object3D](json: js.Any, onLoad: js.UndefOr[js.Function1[Object3D,Unit]]): T = js.native
	def parseAsync[T <: Object3D](json: js.Any): js.Promise[T] = js.native
	def parseGeometries(json: js.Any): objectType10 = js.native
	def parseMaterials(json: js.Any, textures: js.Array[Texture]): js.Array[Material] = js.native
	def parseAnimations(json: js.Any): js.Array[AnimationClip] = js.native
	def parseImages(json: js.Any, onLoad: js.Function0[Unit]): objectType11 = js.native
	def parseImagesAsync(json: js.Any): js.Promise[objectType11] = js.native
	def parseTextures(json: js.Any, images: js.Any): js.Array[Texture] = js.native
	def parseObject[T <: Object3D](data: js.Any, geometries: js.Array[js.Any], materials: js.Array[Material], animations: js.Array[AnimationClip]): T = js.native
@js.native
@JSGlobal("THREE.DefaultLoadingManager")
val DefaultLoadingManager: LoadingManager = js.native;

@js.native
@JSGlobal("THREE.LoadingManager")
class LoadingManager extends js.Object:
	def this(onLoad: js.UndefOr[js.Function0[Unit]], onProgress: js.UndefOr[js.Function3[String,Double,Double,Unit]], onError: js.UndefOr[js.Function1[String,Unit]]) = this()
	var onStart: js.UndefOr[js.Function3[String,Double,Double,Unit]] = js.native;
	var onLoad: js.Function0[Unit] = js.native;
	var onProgress: js.Function3[String,Double,Double,Unit] = js.native;
	var onError: js.Function1[String,Unit] = js.native;
	def setURLModifier(callback: js.UndefOr[js.Function1[String,String]]): this.type = js.native
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
	def load(url: String, onLoad: js.UndefOr[js.Function1[HTMLImageElement,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): HTMLImageElement = js.native


@js.native
@JSGlobal("THREE.AudioLoader")
class AudioLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.Function1[AudioBuffer,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): Unit = js.native


@js.native
@JSGlobal("THREE.MaterialLoader")
class MaterialLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	var textures: objectType12 = js.native;
	def load(url: String, onLoad: js.Function1[Material,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[Error | ErrorEvent,Unit]]): Unit = js.native

	def setTextures(textures: objectType12): this.type = js.native
	def parse(json: js.Any): Material = js.native

@js.native
sealed trait LoaderUtils extends js.Object:
	def decodeText(array: BufferSource): String = js.native
	def extractUrlBase(url: String): String = js.native
@js.native
@JSGlobal("THREE.LoaderUtils")
val LoaderUtils: LoaderUtils = js.native;

@js.native
@JSGlobal("THREE.BufferGeometryLoader")
class BufferGeometryLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.Function1[InstancedBufferGeometry | BufferGeometry,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): Unit = js.native

	def parse(json: js.Any): InstancedBufferGeometry | BufferGeometry = js.native

@js.native
@JSGlobal("THREE.AnimationLoader")
class AnimationLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.Function1[js.Array[AnimationClip],Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): Unit = js.native

	def parse(json: js.Any): js.Array[AnimationClip] = js.native

@js.native
@JSGlobal("THREE.CubeTextureLoader")
class CubeTextureLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(urls: js.Array[String], onLoad: js.UndefOr[js.Function1[CubeTexture,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): CubeTexture = js.native


@js.native
@JSGlobal("THREE.DataTextureLoader")
class DataTextureLoader extends Loader:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	def load(url: String, onLoad: js.Function2[DataTexture,js.Object,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): DataTexture = js.native


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
	var options: js.UndefOr[js.Object] = js.native;
	val isImageBitmapLoader: Boolean = js.native;
	def setOptions(options: js.Object): ImageBitmapLoader = js.native
	def load(url: String, onLoad: js.UndefOr[js.Function1[ImageBitmap,Unit]], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]], onError: js.UndefOr[js.Function1[ErrorEvent,Unit]]): js.Any = js.native


@js.native
@JSGlobal("THREE.Loader")
class Loader extends js.Object:
	def this(manager: js.UndefOr[LoadingManager]) = this()
	var crossOrigin: String = js.native;
	var withCredentials: Boolean = js.native;
	var path: String = js.native;
	var resourcePath: String = js.native;
	var manager: LoadingManager = js.native;
	var requestHeader: objectType13 = js.native;
	def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]]): js.Promise[js.Any] = js.native
	def setCrossOrigin(crossOrigin: String): this.type = js.native
	def setWithCredentials(value: Boolean): this.type = js.native
	def setPath(path: String): this.type = js.native
	def setResourcePath(resourcePath: String): this.type = js.native
	def setRequestHeader(requestHeader: objectType13): this.type = js.native

@js.native
sealed trait objectType11 extends js.Object:
	@JSBracketAccess
	def apply(key: String): HTMLImageElement = js.native

@js.native
sealed trait objectType10 extends js.Object:
	@JSBracketAccess
	def apply(key: String): InstancedBufferGeometry | BufferGeometry = js.native

@js.native
sealed trait objectType13 extends js.Object:
	@JSBracketAccess
	def apply(header: String): String = js.native

@js.native
sealed trait objectType12 extends js.Object:
	@JSBracketAccess
	def apply(key: String): Texture = js.native
