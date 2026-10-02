// entry=0x9d998

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H9d8cc(undefined8 param_1,ulong param_2,ulong param_3)

{
  bool bVar1;
  undefined8 *puVar2;
  ulong in_x14;
  ulong uVar3;
  ulong in_x15;
  long lVar4;
  ulong in_x16;
  long unaff_x19;
  long unaff_x25;
  undefined1 auVar5 [16];
  
  do {
    auVar5 = a64_TBL(ZEXT816(0),
                     *(undefined1 (*) [16])
                      (*(long *)(unaff_x19 + 0x270) +
                       ((in_x15 | -param_3) * 2 - (in_x15 ^ -param_3)) + -0xf),_DAT_0012c6c0);
    puVar2 = (undefined8 *)(unaff_x25 + ((param_3 | in_x14) * 2 - (param_3 ^ in_x14)));
    puVar2[1] = auVar5._8_8_;
    *puVar2 = auVar5._0_8_;
    param_3 = (param_3 | 0x10) + (param_3 & 0x10);
  } while (param_3 != param_2);
  lVar4 = (in_x15 ^ -param_2) + (in_x15 & -param_2) * 2;
  uVar3 = (param_2 | in_x14) + (param_2 & in_x14);
  if (in_x16 != param_2) {
    do {
      *(undefined1 *)(unaff_x25 + uVar3) =
           *(undefined1 *)
            (*(long *)(unaff_x19 + 0x270) +
             (0x2e00d84656e407bf - (-DAT_0027fb18 ^ 0xffffffffffffffffU)) * 0x14 + lVar4);
      uVar3 = uVar3 + 1;
      bVar1 = 0 < lVar4;
      lVar4 = lVar4 + -1;
    } while (bVar1 != 0x2e00d84656e40bbf - (-DAT_0027fb18 ^ 0xffffffffffffffffU) <= uVar3 && bVar1);
  }
                    /* WARNING: Could not recover jumptable at 0x001963b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027ee40)();
  return;
}


