package typings.three.three.helpers

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.textures.*
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
@JSGlobal("THREE.PointLightHelper")
class PointLightHelper extends Object3D:
	def this(light: PointLight, sphereSize: js.UndefOr[Double], color: js.UndefOr[ColorRepresentation]) = this()
	val `type`: String = js.native;
	val light: PointLight = js.native;
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val matrix: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	def dispose(): Unit = js.native
	def update(): Unit = js.native

@js.native
@JSGlobal("THREE.BoxHelper")
class BoxHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(`object`: Object3D, color: js.UndefOr[ColorRepresentation]) = this()
	val `type`: String = js.native;
	def update(`object`: js.UndefOr[Object3D]): Unit = js.native
	def setFromObject(`object`: Object3D): this.type = js.native

@js.native
@JSGlobal("THREE.SkeletonHelper")
class SkeletonHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(`object`: Object3D) = this()
	val `type`: String = js.native;
	val bones: js.Array[Bone] = js.native;
	val root: Object3D = js.native;
	var isSkeletonHelper: Boolean = js.native;
	val matrix: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
	def update(): Unit = js.native

@js.native
@JSGlobal("THREE.HemisphereLightHelper")
class HemisphereLightHelper extends Object3D:
	def this(light: HemisphereLight, size: Double, color: js.UndefOr[ColorRepresentation]) = this()
	val light: HemisphereLight = js.native;
	val matrix: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	val material: MeshBasicMaterial = js.native;
	val color: js.UndefOr[ColorRepresentation] = js.native;
	def dispose(): Unit = js.native
	def update(): Unit = js.native

@js.native
@JSGlobal("THREE.CameraHelper")
class CameraHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(camera: Camera) = this()
	val camera: Camera = js.native;
	val pointMap: objectType1 = js.native;
	val `type`: String = js.native;
	def update(): Unit = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.PlaneHelper")
class PlaneHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(plane: Plane, size: js.UndefOr[Double], hex: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val plane: Plane = js.native;
	val size: Double = js.native;
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native

@js.native
@JSGlobal("THREE.DirectionalLightHelper")
class DirectionalLightHelper extends Object3D:
	def this(light: DirectionalLight, size: js.UndefOr[Double], color: js.UndefOr[ColorRepresentation]) = this()
	val light: DirectionalLight = js.native;
	val lightPlane: Line[BufferGeometry,Material | js.Array[Material]] = js.native;
	val targetLine: Line[BufferGeometry,Material | js.Array[Material]] = js.native;
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val matrix: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	def dispose(): Unit = js.native
	def update(): Unit = js.native

@js.native
@JSGlobal("THREE.Box3Helper")
class Box3Helper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(box: Box3, color: js.UndefOr[Color]) = this()
	val `type`: String = js.native;
	val box: Box3 = js.native;

@js.native
@JSGlobal("THREE.GridHelper")
class GridHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(size: js.UndefOr[Double], divisions: js.UndefOr[Double], color1: js.UndefOr[ColorRepresentation], color2: js.UndefOr[ColorRepresentation]) = this()
	val `type`: String = js.native;
	def setColors(color1: js.UndefOr[ColorRepresentation], color2: js.UndefOr[ColorRepresentation]): Unit = js.native

@js.native
@JSGlobal("THREE.PolarGridHelper")
class PolarGridHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(radius: js.UndefOr[Double], radials: js.UndefOr[Double], circles: js.UndefOr[Double], divisions: js.UndefOr[Double], color1: js.UndefOr[ColorRepresentation], color2: js.UndefOr[ColorRepresentation]) = this()
	val `type`: String = js.native;

@js.native
@JSGlobal("THREE.SpotLightHelper")
class SpotLightHelper extends Object3D:
	def this(light: Light, color: js.UndefOr[ColorRepresentation]) = this()
	val light: Light = js.native;
	val matrix: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val cone: LineSegments[BufferGeometry,Material | js.Array[Material]] = js.native;
	def dispose(): Unit = js.native
	def update(): Unit = js.native

@js.native
@JSGlobal("THREE.ArrowHelper")
class ArrowHelper extends Object3D:
	def this(dir: js.UndefOr[Vector3], origin: js.UndefOr[Vector3], length: js.UndefOr[Double], color: js.UndefOr[ColorRepresentation], headLength: js.UndefOr[Double], headWidth: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val line: Line[BufferGeometry,Material | js.Array[Material]] = js.native;
	val cone: Mesh[BufferGeometry,Material | js.Array[Material]] = js.native;
	def setDirection(dir: Vector3): Unit = js.native
	def setLength(length: Double, headLength: js.UndefOr[Double], headWidth: js.UndefOr[Double]): Unit = js.native
	def setColor(color: ColorRepresentation): Unit = js.native

@js.native
@JSGlobal("THREE.AxesHelper")
class AxesHelper extends LineSegments[BufferGeometry,Material | js.Array[Material]]:
	def this(size: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	def setColors(xAxisColor: Color, yAxisColor: Color, zAxisColor: Color): this.type = js.native
	def dispose(): Unit = js.native

@js.native
sealed trait objectType1 extends js.Object:
	@JSBracketAccess
	def apply(id: String): js.Array[Double] = js.native