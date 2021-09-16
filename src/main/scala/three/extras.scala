package typings.three.extras

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
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
@JSGlobal("THREE.DataUtils")
object DataUtils extends js.Object:
	def toHalfFloat(`val`: Double): Double = js.native

@js.native
@JSGlobal("THREE.ImageUtils")
object ImageUtils extends js.Object:
	def getDataURL(image: js.Any): String = js.native
	val crossOrigin: String = js.native
	def loadTexture(url: String, mapping: js.UndefOr[Mapping] = js.undefined, onLoad: js.UndefOr[js.Function1[Texture,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[String,Unit]] = js.undefined): Texture = js.native
	def loadTextureCube(array: js.Array[String], mapping: js.UndefOr[Mapping] = js.undefined, onLoad: js.UndefOr[js.Function1[Texture,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[String,Unit]] = js.undefined): Texture = js.native

@js.native
trait Vec2 extends js.Object:
	var x: Double = js.native
	var y: Double = js.native

@js.native
@JSGlobal("THREE.ShapeUtils")
object ShapeUtils extends js.Object:
	def area(contour: js.Array[Vec2]): Double = js.native
	def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
	def isClockWise(pts: js.Array[Vec2]): Boolean = js.native

@js.native
@JSGlobal("THREE.PMREMGenerator")
class PMREMGenerator extends js.Object:
	def this(renderer: WebGLRenderer) = this()
	def fromScene(scene: Scene, sigma: js.UndefOr[Double] = js.undefined, near: js.UndefOr[Double] = js.undefined, far: js.UndefOr[Double] = js.undefined): WebGLRenderTarget = js.native
	def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
	def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
	def compileCubemapShader(): Unit = js.native
	def compileEquirectangularShader(): Unit = js.native
	def dispose(): Unit = js.native
