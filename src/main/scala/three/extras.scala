package typings.three.three.extras

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
@JSGlobal("THREE.DataUtils")
object DataUtils extends js.Object:
	def toHalfFloat(`val`: Double): Double = js.native

@js.native
@JSGlobal("THREE.ImageUtils")
object ImageUtils extends js.Object:
	def getDataURL(image: js.Any): String = js.native
	val crossOrigin: String = js.native;
	def loadTexture(url: String, mapping: js.UndefOr[Mapping], onLoad: js.UndefOr[js.Function1[Texture,Unit]], onError: js.UndefOr[js.Function1[String,Unit]]): Texture = js.native
	def loadTextureCube(array: js.Array[String], mapping: js.UndefOr[Mapping], onLoad: js.UndefOr[js.Function1[Texture,Unit]], onError: js.UndefOr[js.Function1[String,Unit]]): Texture = js.native

@js.native
sealed trait Vec2 extends js.Object:
	var x: Double = js.native;
	var y: Double = js.native;

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
	def fromScene(scene: Scene, sigma: js.UndefOr[Double], near: js.UndefOr[Double], far: js.UndefOr[Double]): WebGLRenderTarget = js.native
	def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
	def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
	def compileCubemapShader(): Unit = js.native
	def compileEquirectangularShader(): Unit = js.native
	def dispose(): Unit = js.native
