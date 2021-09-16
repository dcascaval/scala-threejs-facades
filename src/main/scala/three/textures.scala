package typings.three.textures

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*

@js.native
@JSGlobal("THREE.CubeTexture")
class CubeTexture extends Texture:
  def this(
      images: js.UndefOr[js.Array[js.Any]] = js.undefined,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      format: js.UndefOr[PixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined,
      encoding: js.UndefOr[TextureEncoding] = js.undefined
  ) = this()
  var images: js.Any = js.native

  val isCubeTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.CompressedTexture")
class CompressedTexture extends Texture:
  def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      format: js.UndefOr[CompressedPixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined,
      encoding: js.UndefOr[TextureEncoding] = js.undefined
  ) = this()

  val isCompressedTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.DataTexture2DArray")
class DataTexture2DArray extends Texture:
  def this(
      data: js.UndefOr[BufferSource] = js.undefined,
      width: js.UndefOr[Double] = js.undefined,
      height: js.UndefOr[Double] = js.undefined,
      depth: js.UndefOr[Double] = js.undefined
  ) = this()

  var wrapR: Boolean = js.native

  val isDataTexture2DArray: Boolean = js.native

@js.native
@JSGlobal("THREE.CanvasTexture")
class CanvasTexture extends Texture:
  def this(
      canvas: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      format: js.UndefOr[PixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined
  ) = this()
  val isCanvasTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.DataTexture")
class DataTexture extends Texture:
  def this(
      data: BufferSource,
      width: Double,
      height: Double,
      format: js.UndefOr[PixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined,
      encoding: js.UndefOr[TextureEncoding] = js.undefined
  ) = this()

  val isDataTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.VideoTexture")
class VideoTexture extends Texture:
  def this(
      video: HTMLVideoElement,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      format: js.UndefOr[PixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined
  ) = this()
  val isVideoTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.Texture")
class Texture extends EventDispatcher:
  def this(
      image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement] = js.undefined,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      format: js.UndefOr[PixelFormat] = js.undefined,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined,
      encoding: js.UndefOr[TextureEncoding] = js.undefined
  ) = this()
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var sourceFile: String = js.native
  var image: js.Any = js.native
  var mipmaps: js.Array[js.Any] = js.native
  var mapping: Mapping = js.native
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var format: PixelFormat = js.native
  var internalFormat: PixelFormatGPU | Null = js.native
  var `type`: TextureDataType = js.native
  var matrix: Matrix3 = js.native
  var matrixAutoUpdate: Boolean = js.native
  var offset: Vector2 = js.native
  var repeat: Vector2 = js.native
  var center: Vector2 = js.native
  var rotation: Double = js.native
  var generateMipmaps: Boolean = js.native
  var premultiplyAlpha: Boolean = js.native
  var flipY: Boolean = js.native
  var unpackAlignment: Double = js.native
  var encoding: TextureEncoding = js.native
  var isRenderTargetTexture: Boolean = js.native
  var version: Double = js.native
  var needsUpdate: Boolean = js.native
  val isTexture: Boolean = js.native
  var onUpdate: js.Function0[Unit] = js.native

  @JSName("clone")
  def jsClone(): this.type = js.native
  def copy(source: Texture): this.type = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  def dispose(): Unit = js.native
  def transformUv(uv: Vector2): Vector2 = js.native
  def updateMatrix(): Unit = js.native

@js.native
@JSGlobal("THREE.Texture")
object Texture extends js.Object:
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native

@js.native
@JSGlobal("THREE.DepthTexture")
class DepthTexture extends Texture:
  def this(
      width: Double,
      height: Double,
      `type`: js.UndefOr[TextureDataType] = js.undefined,
      mapping: js.UndefOr[Mapping] = js.undefined,
      wrapS: js.UndefOr[Wrapping] = js.undefined,
      wrapT: js.UndefOr[Wrapping] = js.undefined,
      magFilter: js.UndefOr[TextureFilter] = js.undefined,
      minFilter: js.UndefOr[TextureFilter] = js.undefined,
      anisotropy: js.UndefOr[Double] = js.undefined
  ) = this()

  val isDepthTexture: Boolean = js.native

@js.native
@JSGlobal("THREE.DataTexture3D")
class DataTexture3D extends Texture:
  def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()

  var wrapR: Boolean = js.native

  val isDataTexture3D: Boolean = js.native
