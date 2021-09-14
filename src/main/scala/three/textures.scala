package typings.three.three.textures

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
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
@JSGlobal("THREE.CubeTexture")
class CubeTexture extends Texture:
	def this(images: js.UndefOr[js.Array[js.Any]], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[Double], encoding: js.UndefOr[TextureEncoding]) = this()
	val images: js.Any = js.native;
	val flipY: Boolean = js.native;
	var isCubeTexture: Boolean = js.native;

@js.native
@JSGlobal("THREE.CompressedTexture")
class CompressedTexture extends Texture:
	def this(mipmaps: js.Array[ImageData], width: Double, height: Double, format: js.UndefOr[CompressedPixelFormat], `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[Double], encoding: js.UndefOr[TextureEncoding]) = this()
	val image: objectType2 = js.native;
	val mipmaps: js.Array[ImageData] = js.native;
	val flipY: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;
	var isCompressedTexture: Boolean = js.native;

@js.native
@JSGlobal("THREE.DataTexture2DArray")
class DataTexture2DArray extends Texture:
	def this(data: js.UndefOr[BufferSource], width: js.UndefOr[Double], height: js.UndefOr[Double], depth: js.UndefOr[Double]) = this()
	val magFilter: TextureFilter = js.native;
	val minFilter: TextureFilter = js.native;
	val wrapR: Boolean = js.native;
	val flipY: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;
	var isDataTexture2DArray: Boolean = js.native;

@js.native
@JSGlobal("THREE.CanvasTexture")
class CanvasTexture extends Texture:
	def this(canvas: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap, mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[Double]) = this()
	var isCanvasTexture: Boolean = js.native;

@js.native
@JSGlobal("THREE.DataTexture")
class DataTexture extends Texture:
	def this(data: BufferSource, width: Double, height: Double, format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[Double], encoding: js.UndefOr[TextureEncoding]) = this()
	val image: ImageData = js.native;
	val flipY: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;
	val unpackAlignment: Double = js.native;
	val format: PixelFormat = js.native;
	var isDataTexture: Boolean = js.native;

@js.native
@JSGlobal("THREE.VideoTexture")
class VideoTexture extends Texture:
	def this(video: HTMLVideoElement, mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[Double]) = this()
	var isVideoTexture: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;

@js.native
@JSGlobal("THREE.Texture")
class Texture extends EventDispatcher:
	def this(image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[Double], encoding: js.UndefOr[TextureEncoding]) = this()
	val id: Double = js.native;
	val uuid: String = js.native;
	val name: String = js.native;
	val sourceFile: String = js.native;
	val image: js.Any = js.native;
	val mipmaps: js.Array[js.Any] = js.native;
	val mapping: Mapping = js.native;
	val wrapS: Wrapping = js.native;
	val wrapT: Wrapping = js.native;
	val magFilter: TextureFilter = js.native;
	val minFilter: TextureFilter = js.native;
	val anisotropy: Double = js.native;
	val format: PixelFormat = js.native;
	val internalFormat: PixelFormatGPU | Null = js.native;
	val `type`: TextureDataType = js.native;
	val matrix: Matrix3 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	val offset: Vector2 = js.native;
	val repeat: Vector2 = js.native;
	val center: Vector2 = js.native;
	val rotation: Double = js.native;
	val generateMipmaps: Boolean = js.native;
	val premultiplyAlpha: Boolean = js.native;
	val flipY: Boolean = js.native;
	val unpackAlignment: Double = js.native;
	val encoding: TextureEncoding = js.native;
	val isRenderTargetTexture: Boolean = js.native;
	val version: Double = js.native;
	val needsUpdate: Boolean = js.native;
	var isTexture: Boolean = js.native;
	val onUpdate: js.Function0[Unit] = js.native;


	def clone(): this.type = js.native
	def copy(source: Texture): this.type = js.native
	def toJSON(meta: js.Any): js.Any = js.native
	def dispose(): Unit = js.native
	def transformUv(uv: Vector2): Vector2 = js.native
	def updateMatrix(): Unit = js.native

object Texture:
	val DEFAULT_IMAGE: js.Any = js.native;
	val DEFAULT_MAPPING: js.Any = js.native;

@js.native
@JSGlobal("THREE.DepthTexture")
class DepthTexture extends Texture:
	def this(width: Double, height: Double, `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[Double]) = this()
	val image: objectType2 = js.native;
	val flipY: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;
	var isDepthTexture: Boolean = js.native;

@js.native
@JSGlobal("THREE.DataTexture3D")
class DataTexture3D extends Texture:
	def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()
	val magFilter: TextureFilter = js.native;
	val minFilter: TextureFilter = js.native;
	val wrapR: Boolean = js.native;
	val flipY: Boolean = js.native;
	val generateMipmaps: Boolean = js.native;
	var isDataTexture3D: Boolean = js.native;

@js.native
sealed trait objectType2 extends js.Object:
	val width: Double = js.native;
	val height: Double = js.native;
