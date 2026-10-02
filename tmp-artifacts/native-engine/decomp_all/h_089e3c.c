// entry=0x89e3c

void H89e3c(ulong param_1)

{
  uint uVar1;
  undefined1 *puVar2;
  int iVar3;
  
  iVar3 = (int)DAT_00274480;
  if ((param_1 & 1) != 0) {
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar3 | 0x94f8c2f2U) * 2 - (-iVar3 ^ 0x94f8c2f2U)) * 0x2b +
               (long)(int)((-iVar3 | 0x94f8c2faU) + (-iVar3 & 0x94f8c2faU))])();
    uVar1 = -(int)DAT_00274480;
    puVar2 = (undefined1 *)
             (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)((uVar1 | 0x94f8c2f2) * 2 - (uVar1 ^ 0x94f8c2f2)) * 300 +
                        (long)(int)(-0x6b073bfa - (-(int)DAT_00274480 ^ 0xffffffffU))])
                       ((-DAT_00274480 | 0x99bbd15a94f8c2f6U) * 2 -
                        (-DAT_00274480 ^ 0x99bbd15a94f8c2f6U));
    *puVar2 = 0x31;
    puVar2[1] = (-(char)DAT_00274480 & 0x7fU | 0x22) * '\x02' - (-(char)DAT_00274480 ^ 0x22U);
    puVar2[(-DAT_00274480 | 0x99bbd15a94f8c2f4U) + (-DAT_00274480 & 0x99bbd15a94f8c2f4U)] = 0x38;
    puVar2[3] = 0;
                    /* WARNING: Could not recover jumptable at 0x0017d334. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f9e8)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00186ce8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275330)
            (&DAT_0029e620 +
             (long)(int)((-iVar3 | 0x94f8c2f2U) + (-iVar3 & 0x94f8c2f2U)) * 0x2b +
             (long)(int)((-iVar3 | 0x94f8c318U) * 2 - (-iVar3 ^ 0x94f8c318U)));
  return;
}


