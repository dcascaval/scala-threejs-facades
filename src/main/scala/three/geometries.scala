package typings.three.three.geometries

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
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.RingGeometry")
class RingGeometry extends BufferGeometry:
	def this(innerRadius: js.UndefOr[Double], outerRadius: js.UndefOr[Double], thetaSegments: js.UndefOr[Double], phiSegments: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType73 = js.native;


object RingGeometry:
	def fromJSON(data: js.Any): RingGeometry = js.native

@js.native
@JSGlobal("THREE.WireframeGeometry")
class WireframeGeometry extends BufferGeometry:
	def this(geometry: BufferGeometry) = this()
	val `type`: String = js.native;

@js.native
@JSGlobal("THREE.IcosahedronGeometry")
class IcosahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object IcosahedronGeometry:
	def fromJSON(data: js.Any): IcosahedronGeometry = js.native

@js.native
@JSGlobal("THREE.CylinderGeometry")
class CylinderGeometry extends BufferGeometry:
	def this(radiusTop: js.UndefOr[Double], radiusBottom: js.UndefOr[Double], height: js.UndefOr[Double], radialSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], openEnded: js.UndefOr[Boolean], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType74 = js.native;


object CylinderGeometry:
	def fromJSON(data: js.Any): CylinderGeometry = js.native

@js.native
sealed trait ExtrudeGeometryOptions extends js.Object:
	val curveSegments: js.UndefOr[Double] = js.native;
	val steps: js.UndefOr[Double] = js.native;
	val depth: js.UndefOr[Double] = js.native;
	val bevelEnabled: js.UndefOr[Boolean] = js.native;
	val bevelThickness: js.UndefOr[Double] = js.native;
	val bevelSize: js.UndefOr[Double] = js.native;
	val bevelOffset: js.UndefOr[Double] = js.native;
	val bevelSegments: js.UndefOr[Double] = js.native;
	val extrudePath: js.UndefOr[Curve[Vector3]] = js.native;
	val UVGenerator: js.UndefOr[UVGenerator] = js.native;

@js.native
sealed trait UVGenerator extends js.Object:
	def generateTopUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double): js.Array[Vector2] = js.native
	def generateSideWallUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double, indexD: Double): js.Array[Vector2] = js.native

@js.native
@JSGlobal("THREE.ExtrudeGeometry")
class ExtrudeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], options: js.UndefOr[ExtrudeGeometryOptions]) = this()
	val `type`: String = js.native;
	def addShapeList(shapes: js.Array[Shape], options: js.UndefOr[js.Any]): Unit = js.native
	def addShape(shape: Shape, options: js.UndefOr[js.Any]): Unit = js.native


object ExtrudeGeometry:
	def fromJSON(data: js.Any): ExtrudeGeometry = js.native

@js.native
@JSGlobal("THREE.OctahedronGeometry")
class OctahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object OctahedronGeometry:
	def fromJSON(data: js.Any): OctahedronGeometry = js.native

@js.native
@JSGlobal("THREE.ShapeGeometry")
class ShapeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], curveSegments: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object ShapeGeometry:
	def fromJSON(data: js.Any): ShapeGeometry = js.native

@js.native
@JSGlobal("THREE.ParametricGeometry")
class ParametricGeometry extends BufferGeometry:
	def this(func: js.Function3[Double,Double,Vector3,Unit], slices: Double, stacks: Double) = this()
	val `type`: String = js.native;
	val parameters: objectType75 = js.native;

@js.native
@JSGlobal("THREE.DodecahedronGeometry")
class DodecahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object DodecahedronGeometry:
	def fromJSON(data: js.Any): DodecahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TorusKnotGeometry")
class TorusKnotGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], tube: js.UndefOr[Double], tubularSegments: js.UndefOr[Double], radialSegments: js.UndefOr[Double], p: js.UndefOr[Double], q: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType76 = js.native;


object TorusKnotGeometry:
	def fromJSON(data: js.Any): TorusKnotGeometry = js.native

@js.native
@JSGlobal("THREE.PlaneGeometry")
class PlaneGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double], height: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType77 = js.native;


object PlaneGeometry:
	def fromJSON(data: js.Any): PlaneGeometry = js.native

@js.native
@JSGlobal("THREE.BoxGeometry")
class BoxGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double], height: js.UndefOr[Double], depth: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], depthSegments: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType78 = js.native;


object BoxGeometry:
	def fromJSON(data: js.Any): BoxGeometry = js.native

@js.native
@JSGlobal("THREE.SphereGeometry")
class SphereGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], phiStart: js.UndefOr[Double], phiLength: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType79 = js.native;


object SphereGeometry:
	def fromJSON(data: js.Any): SphereGeometry = js.native

@js.native
@JSGlobal("THREE.EdgesGeometry")
class EdgesGeometry extends BufferGeometry:
	def this(geometry: BufferGeometry, thresholdAngle: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType80 = js.native;

@js.native
@JSGlobal("THREE.ConeGeometry")
class ConeGeometry extends CylinderGeometry:
	def this(radius: js.UndefOr[Double], height: js.UndefOr[Double], radialSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], openEnded: js.UndefOr[Boolean], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object ConeGeometry:
	def fromJSON(data: js.Any): ConeGeometry = js.native

@js.native
@JSGlobal("THREE.CircleGeometry")
class CircleGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], segments: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType81 = js.native;


object CircleGeometry:
	def fromJSON(data: js.Any): CircleGeometry = js.native

@js.native
@JSGlobal("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends BufferGeometry:
	def this(vertices: js.Array[Double], indices: js.Array[Double], radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType82 = js.native;


object PolyhedronGeometry:
	def fromJSON(data: js.Any): PolyhedronGeometry = js.native

@js.native
@JSGlobal("THREE.LatheGeometry")
class LatheGeometry extends BufferGeometry:
	def this(points: js.Array[Vector2], segments: js.UndefOr[Double], phiStart: js.UndefOr[Double], phiLength: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType83 = js.native;


object LatheGeometry:
	def fromJSON(data: js.Any): LatheGeometry = js.native

@js.native
sealed trait TextGeometryParameters extends js.Object:
	val font: Font = js.native;
	val size: js.UndefOr[Double] = js.native;
	val height: js.UndefOr[Double] = js.native;
	val curveSegments: js.UndefOr[Double] = js.native;
	val bevelEnabled: js.UndefOr[Boolean] = js.native;
	val bevelThickness: js.UndefOr[Double] = js.native;
	val bevelSize: js.UndefOr[Double] = js.native;
	val bevelOffset: js.UndefOr[Double] = js.native;
	val bevelSegments: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry:
	def this(text: String, parameters: TextGeometryParameters) = this()
	val `type`: String = js.native;
	val parameters: objectType84 = js.native;

@js.native
@JSGlobal("THREE.TorusGeometry")
class TorusGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], tube: js.UndefOr[Double], radialSegments: js.UndefOr[Double], tubularSegments: js.UndefOr[Double], arc: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val parameters: objectType85 = js.native;


object TorusGeometry:
	def fromJSON(data: js.Any): TorusGeometry = js.native

@js.native
@JSGlobal("THREE.TetrahedronGeometry")
class TetrahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()
	val `type`: String = js.native;


object TetrahedronGeometry:
	def fromJSON(data: js.Any): TetrahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TubeGeometry")
class TubeGeometry extends BufferGeometry:
	def this(path: Curve[Vector3], tubularSegments: js.UndefOr[Double], radius: js.UndefOr[Double], radiusSegments: js.UndefOr[Double], closed: js.UndefOr[Boolean]) = this()
	val `type`: String = js.native;
	val parameters: objectType86 = js.native;
	val tangents: js.Array[Vector3] = js.native;
	val normals: js.Array[Vector3] = js.native;
	val binormals: js.Array[Vector3] = js.native;


object TubeGeometry:
	def fromJSON(data: js.Any): TubeGeometry = js.native

@js.native
sealed trait objectType77 extends js.Object:
	val width: Double = js.native;
	val height: Double = js.native;
	val widthSegments: Double = js.native;
	val heightSegments: Double = js.native;

@js.native
sealed trait objectType66 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType87 = js.native;

@js.native
sealed trait objectType73 extends js.Object:
	val innerRadius: Double = js.native;
	val outerRadius: Double = js.native;
	val thetaSegments: Double = js.native;
	val phiSegments: Double = js.native;
	val thetaStart: Double = js.native;
	val thetaLength: Double = js.native;

@js.native
sealed trait objectType70 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType88 = js.native;

@js.native
sealed trait objectType78 extends js.Object:
	val width: Double = js.native;
	val height: Double = js.native;
	val depth: Double = js.native;
	val widthSegments: Double = js.native;
	val heightSegments: Double = js.native;
	val depthSegments: Double = js.native;

@js.native
sealed trait objectType76 extends js.Object:
	val radius: Double = js.native;
	val tube: Double = js.native;
	val tubularSegments: Double = js.native;
	val radialSegments: Double = js.native;
	val p: Double = js.native;
	val q: Double = js.native;

@js.native
sealed trait objectType85 extends js.Object:
	val radius: Double = js.native;
	val tube: Double = js.native;
	val radialSegments: Double = js.native;
	val tubularSegments: Double = js.native;
	val arc: Double = js.native;

@js.native
sealed trait objectType72 extends js.Object:
	val directionalLength: Double = js.native;
	val pointLength: Double = js.native;
	val spotLength: Double = js.native;
	val rectAreaLength: Double = js.native;
	val hemiLength: Double = js.native;
	val numDirectionalShadows: Double = js.native;
	val numPointShadows: Double = js.native;
	val numSpotShadows: Double = js.native;

@js.native
sealed trait objectType71 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType89 = js.native;

@js.native
sealed trait objectType74 extends js.Object:
	val radiusTop: Double = js.native;
	val radiusBottom: Double = js.native;
	val height: Double = js.native;
	val radialSegments: Double = js.native;
	val heightSegments: Double = js.native;
	val openEnded: Boolean = js.native;
	val thetaStart: Double = js.native;
	val thetaLength: Double = js.native;

@js.native
sealed trait objectType80 extends js.Object:
	val thresholdAngle: Double = js.native;

@js.native
sealed trait objectType75 extends js.Object:
	val func: js.Function3[Double,Double,Vector3,Unit] = js.native;
	val slices: Double = js.native;
	val stacks: Double = js.native;

@js.native
sealed trait objectType67 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType90 = js.native;

@js.native
sealed trait objectType82 extends js.Object:
	val vertices: js.Array[Double] = js.native;
	val indices: js.Array[Double] = js.native;
	val radius: Double = js.native;
	val detail: Double = js.native;

@js.native
sealed trait objectType69 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType91 = js.native;

@js.native
sealed trait objectType86 extends js.Object:
	val path: Curve[Vector3] = js.native;
	val tubularSegments: Double = js.native;
	val radius: Double = js.native;
	val radialSegments: Double = js.native;
	val closed: Boolean = js.native;

@js.native
sealed trait objectType81 extends js.Object:
	val radius: Double = js.native;
	val segments: Double = js.native;
	val thetaStart: Double = js.native;
	val thetaLength: Double = js.native;

@js.native
sealed trait objectType68 extends js.Object:
	val value: js.Array[js.Any] = js.native;
	val properties: objectType92 = js.native;

@js.native
sealed trait objectType83 extends js.Object:
	val points: js.Array[Vector2] = js.native;
	val segments: Double = js.native;
	val phiStart: Double = js.native;
	val phiLength: Double = js.native;

@js.native
sealed trait objectType84 extends js.Object:
	val font: Font = js.native;
	val size: Double = js.native;
	val height: Double = js.native;
	val curveSegments: Double = js.native;
	val bevelEnabled: Boolean = js.native;
	val bevelThickness: Double = js.native;
	val bevelSize: Double = js.native;
	val bevelOffset: Double = js.native;
	val bevelSegments: Double = js.native;

@js.native
sealed trait objectType79 extends js.Object:
	val radius: Double = js.native;
	val widthSegments: Double = js.native;
	val heightSegments: Double = js.native;
	val phiStart: Double = js.native;
	val phiLength: Double = js.native;
	val thetaStart: Double = js.native;
	val thetaLength: Double = js.native;
