package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object loaders extends js.Object:
	@js.native
	class FileLoader extends js.Object:
		val mimeType: js.UndefOr[MimeType] = js.native;
		val responseType: js.UndefOr[String] = js.native;
		def load(url: String, onLoad: js.UndefOr[js.Function1[String | ArrayBuffer,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): js.Any = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[String | ArrayBuffer] = js.native
		def setMimeType(mimeType: MimeType): FileLoader = js.native
		def setResponseType(responseType: String): FileLoader = js.native
	@js.native
	class TextureLoader extends js.Object:
		def load(url: String, onLoad: js.UndefOr[js.Function1[Texture,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): Texture = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[Texture] = js.native
	@js.native
	class CompressedTextureLoader extends js.Object:
		def load(url: String, onLoad: js.Function1[CompressedTexture,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): CompressedTexture = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[CompressedTexture] = js.native
	@js.native
	class FontLoader extends js.Object:
		def load(url: String, onLoad: js.UndefOr[js.Function1[Font,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[Font] = js.native
		def parse(json: js.Any): Font = js.native
	@js.native
	class ObjectLoader extends js.Object:
		def load(url: String, onLoad: js.UndefOr[js.Function1[ObjectType,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[Error | ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync[ObjectType <: Object3D}](url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[ObjectType] = js.native
		def parse[T <: Object3D}](json: js.Any, onLoad: js.UndefOr[js.Function1[Object3D,Unit]] = js.undefined): T = js.native
		def parseAsync[T <: Object3D}](json: js.Any): Promise[T] = js.native
		def parseGeometries(json: js.Any): objectType26 = js.native
		def parseMaterials(json: js.Any, textures: js.Array[Texture]): js.Array[Material] = js.native
		def parseAnimations(json: js.Any): js.Array[AnimationClip] = js.native
		def parseImages(json: js.Any, onLoad: js.Function0[,Unit]): objectType27 = js.native
		def parseImagesAsync(json: js.Any): Promise[objectType27] = js.native
		def parseTextures(json: js.Any, images: js.Any): js.Array[Texture] = js.native
		def parseObject[T <: Object3D}](data: js.Any, geometries: js.Array[js.Any], materials: js.Array[Material], animations: js.Array[AnimationClip]): T = js.native
	val DefaultLoadingManager: LoadingManager = js.native;
	@js.native
	class LoadingManager extends js.Object:
		val onStart: js.UndefOr[js.UndefOr[js.Function3[String,Double,Double,Unit]]] = js.native;
		val onLoad: js.Function0[,Unit] = js.native;
		val onProgress: js.Function3[String,Double,Double,Unit] = js.native;
		val onError: js.Function1[String,Unit] = js.native;
		def setURLModifier(callback: js.UndefOr[js.Function1[String,String]] = js.undefined): this.type = js.native
		def resolveURL(url: String): String = js.native
		def itemStart(url: String): Unit = js.native
		def itemEnd(url: String): Unit = js.native
		def itemError(url: String): Unit = js.native
		def addHandler(regex: RegExp, loader: Loader): this.type = js.native
		def removeHandler(regex: RegExp): this.type = js.native
		def getHandler(file: String): Loader | null = js.native
	@js.native
	class ImageLoader extends js.Object:
		def load(url: String, onLoad: js.UndefOr[js.Function1[HTMLImageElement,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): HTMLImageElement = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[HTMLImageElement] = js.native
	@js.native
	class AudioLoader extends js.Object:
		def load(url: String, onLoad: js.Function1[AudioBuffer,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[AudioBuffer] = js.native
	@js.native
	class MaterialLoader extends js.Object:
		val textures: objectType28 = js.native;
		def load(url: String, onLoad: js.Function1[Material,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[Error | ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[Material] = js.native
		def setTextures(textures: objectType28): this.type = js.native
		def parse(json: js.Any): Material = js.native
	@js.nativetrait LoaderUtils extends js.Object:
		def decodeText(array: BufferSource): String = js.native
		def extractUrlBase(url: String): String = js.native
	val LoaderUtils: LoaderUtils = js.native;
	@js.native
	class BufferGeometryLoader extends js.Object:
		def load(url: String, onLoad: js.Function1[InstancedBufferGeometry | BufferGeometry,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[InstancedBufferGeometry | BufferGeometry] = js.native
		def parse(json: js.Any): InstancedBufferGeometry | BufferGeometry = js.native
	@js.native
	class AnimationLoader extends js.Object:
		def load(url: String, onLoad: js.Function1[js.Array[AnimationClip],Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): Unit = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[js.Array[AnimationClip]] = js.native
		def parse(json: js.Any): js.Array[AnimationClip] = js.native
	@js.native
	class CubeTextureLoader extends js.Object:
		def load(urls: js.Array[String], onLoad: js.UndefOr[js.Function1[CubeTexture,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): CubeTexture = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[CubeTexture] = js.native
	@js.native
	class DataTextureLoader extends js.Object:
		def load(url: String, onLoad: js.Function2[DataTexture,js.Object,Unit], onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): DataTexture = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[DataTexture] = js.native
	
	@js.native
	JSGlobal("Cache")
	object Cache extends js.Object:
		val enabled: Boolean = js.native;
		val files: js.Any = js.native;
		def add(key: String, file: js.Any): Unit = js.native
		def get(key: String): js.Any = js.native
		def remove(key: String): Unit = js.native
		def clear(): Unit = js.native
	@js.native
	class ImageBitmapLoader extends js.Object:
		val options: js.UndefOr[js.Object] = js.native;
		var isImageBitmapLoader: true = js.native;
		def setOptions(options: js.Object): ImageBitmapLoader = js.native
		def load(url: String, onLoad: js.UndefOr[js.Function1[ImageBitmap,Unit]] = js.undefined, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[ErrorEvent,Unit]] = js.undefined): js.Any = js.native
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[ImageBitmap] = js.native
	@js.native
	class Loader extends js.Object:
		val crossOrigin: String = js.native;
		val withCredentials: Boolean = js.native;
		val path: String = js.native;
		val resourcePath: String = js.native;
		val manager: LoadingManager = js.native;
		val requestHeader: objectType29 = js.native;
		def loadAsync(url: String, onProgress: js.UndefOr[js.Function1[ProgressEvent,Unit]] = js.undefined): Promise[js.Any] = js.native
		def setCrossOrigin(crossOrigin: String): this.type = js.native
		def setWithCredentials(value: Boolean): this.type = js.native
		def setPath(path: String): this.type = js.native
		def setResourcePath(resourcePath: String): this.type = js.native
		def setRequestHeader(requestHeader: objectType29): this.type = js.native
